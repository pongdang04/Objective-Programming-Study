package Practice;

import java.util.Scanner;

public class Duplicate {
    public static void PrnArr(int[] iArr){
        for(int i=0;i<iArr.length;i++){
            System.out.print(iArr[i]+" ");
        }
    }

    public static void ArrInput(int[] inputArr, int[] resultArr){
        int tmp;
        Scanner onInDev = new Scanner(System.in);
        for(int i=0;i<inputArr.length;i++){
            System.out.print("Enter number between 0~9");

            while(true){
                tmp = onInDev.nextInt();
                if(tmp>=0&&tmp<=9){
                    break;
                }else{
                    System.out.print("Enter number between 0~9");
                }
            }
            inputArr[i]= tmp;
            resultArr[tmp]++;
        }
        onInDev.close();
    }
    public static void main(String[] args) {
        int[] inputArr = new int[10];
        int[] resultArr = new int[10];
        Scanner iInputDev = new Scanner(System.in);
        int tmp;

        //initialization
        for(int i=0;i<10;i++){
            resultArr[i]=0;
        }


       /* for(int i=0;i<10;i++){
            System.out.print("Enter number between 0~9");

            while(true){
                tmp = iInputDev.nextInt();
                if(tmp>=0&&tmp<=9){
                    break;
                }else{
                    System.out.print("Enter number between 0~9");
                }
            }
            inputArr[i]= tmp;
            resultArr[tmp]++;
        }*/

        System.out.print("input : ");
        /*for(int i=0;i<10;i++){
            System.out.print(inputArr[i]+" ");
        }*/
        PrnArr(inputArr);
        System.out.println("Duplicated numbers..");
        /*for(int i=0;i<10;i++){
            if(resultArr[i]>=2){
                System.out.print(resultArr[i]+" ");
            }
        }*/
        PrnArr(resultArr);
        /*for(int i=0;i<10;i++){
            if(resultArr[i]==0){
                System.out.print(resultArr[i]+" ");
            }
        }*/
        iInputDev.close();
    }
}
