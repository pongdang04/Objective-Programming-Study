import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		int input;
		int iMod3;
		
		Scanner Scanner;
		Scanner= new Scanner(System.in);
		
		System.out.print("Enter number: ");
		input=Scanner.nextInt();
		
		Scanner.close();
		
		iMod3=input%3;
		
		if(iMod3==0) {
			System.out.print("3의 배수 입니다.");
		}
		else {
			System.out.print("3의 배수가 아닙니다.");
		}		
	}

}
