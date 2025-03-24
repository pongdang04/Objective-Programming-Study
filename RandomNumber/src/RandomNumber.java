import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		int randomNumber,input, iAttempts;
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		randomNumber= (int)(Math.random()*100)+1;
		iAttempts = 0;
		System.out.println(randomNumber);
		while(true) {
			System.out.print("1~100사이 숫자를 입력하세요 : ");
			input = oInDev.nextInt();
			iAttempts=iAttempts+1;
			
			if(input>randomNumber) {
				System.out.println("작은 수를 입력하세요");
			}else if(input<randomNumber) {
				System.out.println("큰 수를 입력하세요");
			}else {
				System.out.println(iAttempts+"번 시도 만에 찾았습니다.");
				break;
			}
		}		
		oInDev.close();
	}
}
