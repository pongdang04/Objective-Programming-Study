package Assignments;

import java.util.Scanner;

public class Assignment2_0331_BubbleSort {
    public static void main(String[] args) {
        final int ARR_SIZE = 100;
        int[] input;
        int iTmpInput, iArrLength, tmp;
        Scanner onInDev= new Scanner(System.in);
        input = new int[ARR_SIZE];

        System.out.print("배열의 크기를 선택 : ");
        iArrLength = onInDev.nextInt();

        System.out.print("배열 원소 입력 : ");
        for(int i=0;i<iArrLength;i++){
            input[i]=onInDev.nextInt();
        }

        for(int j=0;j<iArrLength;j++){
            for(int i=j;i<iArrLength-1;i++){
                if(input[i]>input[i+1]){
                    tmp = input[i];
                    input[i]= input[i+1];
                    input[i+1]= tmp;
                }
            }
        }

        System.out.print("정렬 결과 : ");
        for(int i=0;i<iArrLength;i++){
            System.out.print(input[i]+" ");
        }

        onInDev.close();
    }
}
