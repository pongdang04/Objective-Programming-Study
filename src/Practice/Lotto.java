package Practice;

public class Lotto {
    public static void main(String[] args) {
        int iRadomNum;
        boolean isDuplicate;
        int[] randNum = new int[5];
        for(int i=0;i<5;i++){
            isDuplicate = false;
            while(true){//creating number
                iRadomNum = (int)(Math.random()*46);
                for(int j=0;j<i;j++){
                    if(randNum[j]==iRadomNum){
                        isDuplicate = true;
                        break;
                    }
                }
                //check the result
                if(isDuplicate == true){
                    continue;
                }else{
                    break;
                }
            }
            randNum[i]= iRadomNum;
        }
    }
}
