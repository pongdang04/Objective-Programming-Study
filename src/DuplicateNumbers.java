import java.util.Scanner;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] inputTypes;
        int[] inputValue;

        Scanner scanner = new Scanner(System.in);
        int input, count;

        inputTypes = new int[10];
        inputValue = new int[10];
        count =0;

        System.out.println("0~9 사이의 숫자를 입력하세요.");

        while (true) {
            if(count ==10){
                break;
            }
            System.out.print((count + 1) + "번째 숫자를 입력하세요: ");
            input = scanner.nextInt();

            if (input >= 0 && input <= 9) {
                inputValue[count] = input;
                count++;
            } else {
                System.out.println("0~9 사이의 숫자로 다시 입력하세요.");
            }
        }

        for (int i = 0; i < 10; i++) {
            inputTypes[inputValue[i]]++;
        }
        System.out.println();
        System.out.print("중복된 숫자: ");
        for (int i = 0; i < 10; i++) {
            if (inputTypes[i] >= 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("\n언급되지 않는 숫자: ");
        for (int i = 0; i < 10; i++) {
            if (inputTypes[i] ==0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
