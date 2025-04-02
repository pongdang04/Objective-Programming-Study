import java.util.Scanner;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] inputTypes;
        int[] inputValue;

        Scanner scanner = new Scanner(System.in);
        int input, counter;

        final int ARR_LENGTH = 10;
        inputTypes = new int[ARR_LENGTH];
        inputValue = new int[ARR_LENGTH];
        counter =0;
        for(int i=0;i<10;i++){
            inputTypes[i]=0;
        }

        System.out.println("0~9 사이의 숫자를 입력하세요.");

        for(int i=0;i<ARR_LENGTH;i++){

            while(true){
                System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
                input = scanner.nextInt();
                if (input >= 0 && input <= 9) {
                    inputValue[i]=input;
                    inputTypes[input]++;
                    break;
                } else {
                    System.out.println("0~9 사이의 숫자로 다시 입력하세요.");
                }
            }
        }

        System.out.print("입력 값 : ");
        for(int i=0;i<10;i++){
            System.out.print(inputValue[i]+" ");
        }
        System.out.println();
        System.out.print("중복된 숫자: ");
        for (int i = 0; i < 10; i++) {
            if (inputTypes[i] >= 2) {
                System.out.print(i + " ");
                counter++;
            }
        }

        System.out.println();
        System.out.print("언급되지 않는 숫자: ");
        for (int i = 0; i < 10; i++) {
            if (inputTypes[i] ==0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        if(counter==0){
            System.out.print("중복된 숫자가 없습니다.");
        }
        scanner.close();
    }
}
