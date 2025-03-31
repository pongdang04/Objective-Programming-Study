import java.util.Scanner;

public class Plus_54 {
	public static void main(String[] args) {
		int resultNumber, isInputNumber, numberInput = 0;
		String input;
		Scanner onInDev;
		onInDev=new Scanner(System.in);
		
		//입력 후 값에 따라
		while(true) {
			System.out.print("숫자 입력 종료(q): ");
			input = onInDev.nextLine();//input
			
			//입력 값 구분하여 경로 설정
			if(input.equals("q")) {
				break;
			}else {
				numberInput =Integer.parseInt(input);
			}
			
			//입력 값이 q가 아닌 경우 -> 54 더해서 출력
			resultNumber = numberInput + 54;
			System.out.println("숫자 + 54 : "+ resultNumber);
		}
		onInDev.close();
	}
}
