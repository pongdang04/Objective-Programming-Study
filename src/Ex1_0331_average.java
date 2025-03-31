import java.util.Scanner;

public class Ex1_0331_average {
    public static void main(String[] args) {
        int sum, score;
        Scanner onInDev = new Scanner(System.in);
        float average;

        sum = 0;
        int[] iInput= new int[10];
        for(int i=0;i<10;i++){
            score = i+1;
        System.out.print("점수 "+ score+"를 입력하세요 : ");
        iInput[i] = onInDev.nextInt();
        sum = sum+iInput[i];}

        average = (float) sum /10;
        System.out.print("입력한 점수들의 평균은 : "+average);
    }
}
