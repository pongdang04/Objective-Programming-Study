import java.util.Scanner;

public class Ex2_0331_rotation {
    public static void main(String[] args) {
        final int MAX_LENGTH =100;
        int length,direction, rotateNum, tmpIdx;
        Scanner onInDev = new Scanner(System.in);
        int[] inputArr = new int[MAX_LENGTH];
        int[] resultArr = new int[MAX_LENGTH];

        System.out.print("Enter size of the array : ");
        length = onInDev.nextInt();

        System.out.print("Enter direction you want to rotate (0: left, 1: right)");
        direction = onInDev.nextInt();

        System.out.print("Enter num you want to rotate : ");
        rotateNum = onInDev.nextInt();

        System.out.print("Enter element of the array : ");
        for(int i=0;i<length; i++){
            inputArr[i]=onInDev.nextInt();
        }

        rotateNum=rotateNum%length;
        if(direction == 0){
            rotateNum = -1*rotateNum;
        }

        for(int i=0;i<length;i++){
            tmpIdx = i+rotateNum;

            if(tmpIdx>(length-1)) {//when Idx left the boundary of the length
                tmpIdx = tmpIdx % length;
            }else if(tmpIdx<0){//when Idx is smaller than min
                tmpIdx = tmpIdx+length;
            }

            resultArr[tmpIdx]=inputArr[i];
        }
  /*      if(direction == 1){
        for(int i=0;i<length;i++){
            tmpIdx = i+rotateNum;

            if(tmpIdx>(length-1)) {
                tmpIdx = tmpIdx % length;
            }
            resultArr[tmpIdx]=inputArr[i];
        }
        }else if(direction == 0){
            for(int i=0;i<length;i++){
                tmpIdx = i - rotateNum;
                if(tmpIdx<0){
                    tmpIdx = tmpIdx+length;
                }
                resultArr[tmpIdx]=inputArr[i];
            }
        }
*/
        System.out.print("");
        for(int i=0;i<length;i++){
            System.out.print(resultArr[i] + " ");
        }
    }
}
