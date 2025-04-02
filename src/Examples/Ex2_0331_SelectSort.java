package Examples;

import java.util.Scanner;

public class Ex2_0331_SelectSort {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 8;
        Scanner myScanner = new Scanner(System.in);
        int[] inputArr = new int[ARRAY_LENGTH];
        int tmpMin, minIdx, tmpSwitch;

        System.out.print("Enter 8 numbers : ");
        for(int i=0;i<ARRAY_LENGTH; i++){
            inputArr[i]=myScanner.nextInt();
        }

        //Sort
        for(int i=0;i<ARRAY_LENGTH;i++){
            tmpMin = inputArr[i];
            minIdx = i;
            for(int j=i;j<ARRAY_LENGTH;j++){
                if(inputArr[j]<tmpMin){
                    tmpMin = inputArr[j];
                    minIdx = j;
                }
            }
            if(minIdx==i){
                continue;
            }else{
                tmpSwitch = tmpMin;
                inputArr[minIdx]= inputArr[i];
                inputArr[i]= tmpSwitch;
            }
        }

        //Print
        for(int i=0;i< inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }
    }
}
