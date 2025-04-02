package ClassExamples;

public class LottoNumbers {
    public static void main(String[] args) {
        final int ARR_SIZE = 6;
        int[] inputValue;
        int iRandNo, tmpMin, tmpIdx, tmp;
        boolean idDuplicate;

        inputValue = new int[ARR_SIZE];

        for(int i=0;i<ARR_SIZE;i++){
            while(true){
                idDuplicate = false;
                iRandNo = (int)(Math.random()*45+1);//create
                for(int j=0;j<i;j++){//test
                    if(inputValue[j]==iRandNo){
                        System.out.println("중복이 처리되었습니다");
                        idDuplicate = true;
                        break;
                    }
                }
                if(idDuplicate==false){
                    break;
                }
            }
            inputValue[i]=iRandNo;
            System.out.println(inputValue[i]);
        }

        for(int i=0;i<ARR_SIZE;i++){
            tmpMin=inputValue[i];
            tmpIdx = i;
            for(int j=i;j<ARR_SIZE;j++){
                if(tmpMin>inputValue[j]){
                    tmpMin = inputValue[j];
                    tmpIdx = j;
                }
            }
            //switch tmpMin, tmpIdx <-> inputValue[i]
            tmp = tmpMin;
            inputValue[tmpIdx]=inputValue[i];
            inputValue[i]=tmp;
        }

        System.out.println();
        System.out.println("결과..");
        for(int i=0;i<ARR_SIZE;i++){
            System.out.println(inputValue[i]);
        }
    }
}
