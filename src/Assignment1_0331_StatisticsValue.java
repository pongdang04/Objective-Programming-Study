public class Assignment1_0331_StatisticsValue {
    public static void main(String[] args) {
        final int MAX_LENGTH = 244;
        int[] randomArray = new int[MAX_LENGTH];
        int min, max, sum, squareSum;
        double arithmeticMean, tmpRecip, recipSum, harmonicMean, squareMean, standardDeviation, variation;

        // 랜덤 값 생성
        for(int i = 0; i < MAX_LENGTH; i++) {
            randomArray[i] = (int) (Math.random() * 101);
        }

        min = randomArray[0];
        max = randomArray[0];
        for(int i = 0; i < MAX_LENGTH; i++) {
            if(randomArray[i] < min) {
                min = randomArray[i];
            }
            if(randomArray[i] > max) {
                max = randomArray[i];
            }
        }
        System.out.println("최저점 : " + min);
        System.out.println("최대점 : " + max);

        sum = 0;
        for(int i = 0; i < MAX_LENGTH; i++) {
            sum += randomArray[i];
        }
        arithmeticMean = (double) sum / MAX_LENGTH;
        System.out.println("산술평균 : " + arithmeticMean);

        recipSum = 0;
        for(int i = 0; i < MAX_LENGTH; i++) {
            tmpRecip = 1.0 / randomArray[i];
            recipSum += tmpRecip;
        }
        harmonicMean = MAX_LENGTH / recipSum;
        System.out.println("조화평균 : " + harmonicMean);

        squareSum = 0;
        for(int i = 0; i < MAX_LENGTH; i++) {
            squareSum += (randomArray[i] * randomArray[i]);
        }
        squareMean = (double) squareSum / MAX_LENGTH;
        variation = squareMean - arithmeticMean * arithmeticMean;
        standardDeviation = Math.sqrt(variation);
        System.out.println("표준편차 : " + standardDeviation);
    }
}
