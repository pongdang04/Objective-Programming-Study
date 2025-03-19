import java.util.Scanner;

public class CMyMiniCafe {
	public static void main(String[] args) {
		int iMenu;	
		Scanner Scanner;
		Scanner= new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("나의 작은 카페 메뉴");
			System.out.println("=================");
			System.out.println(); 
			System.out.println("1. 에스프레소 1500원");
			System.out.println("2. 아메리카노 2000원");
			System.out.println("3. 카페라떼  2500원");
			System.out.println("4. 아이스티  3000원");
			System.out.println();
			System.out.println("=================");
			System.out.print("메뉴를 선택 (0:정산):");
			
			iMenu =Scanner.nextInt();
			if(iMenu==0) {
				System.out.println("정산합니다.");
				break;
			}
			
			switch(iMenu) {				
				case 1:
					System.out.println("에스프레소 1잔결제 1500원 매출증가.");
					break;
				case 2:
					System.out.println("아메리카노 1잔결제 2000원 매출증가.");
					break;
				case 3:
					System.out.println("카페라떼 1잔결제 2500원 매출증가.");
					break;
				case 4:
					System.out.println("아이스티 1잔결제 3000원 매출증가.");
					break;
					
				default:
					System.out.println("없는 메뉴입니다.");
			}

		}
		
		
		
		/*
		if(iMenu==0) {
			System.out.println("정산합니다.");
		}else if(iMenu==1) {
			System.out.println("아메리카노 1잔결제 2000원 매출증가.");
		}else if(iMenu==2) {
			System.out.println("아메리카노 1잔결제 2000원 매출증가.");
		}else if(iMenu==3) {
			System.out.println("카페라떼 1잔결제 2500원 매출증가.");
		}else if(iMenu==4) {
			System.out.println("아이스티 1잔결제 3000원 매출증가.");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		*/
		
		/*switch(iMenu) {
			case 0:
				System.out.println("정산합니다.");
				break;
				
			case 1:
				System.out.println("에스프레소 1잔결제 1500원 매출증가.");
				break;
			case 2:
				System.out.println("아메리카노 1잔결제 2000원 매출증가.");
				break;
			case 3:
				System.out.println("카페라떼 1잔결제 2500원 매출증가.");
				break;
			case 4:
				System.out.println("아이스티 1잔결제 3000원 매출증가.");
				break;
				
			default:
				System.out.println("없는 메뉴입니다.");
		}
		*/
		Scanner.close();
		
	}
}
