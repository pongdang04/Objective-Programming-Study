import java.util.Scanner;

public class CMyMiniCafe {
	public static void main(String[] args) {
		int iMenu, iTotalMoney;
		int iPriceZ[]= {1500,2000,2500,3000};
		String sMenuNameZ[]= {"에스프레소","아메리카노","카페라떼","아이스티"};
		
		Scanner Scanner;
		Scanner= new Scanner(System.in);
		
		iTotalMoney =0;
		while(true) {
			System.out.println("나의 작은 카페 메뉴");
			System.out.println("=================");
			System.out.println(); 
			
			for(int i=0;i<sMenuNameZ.length;i++) {
				int index = i+1;
				System.out.println(index +". " +sMenuNameZ[i]+ iPriceZ[i]+"원");
			}
			
			System.out.println();
			System.out.println("=================");
			System.out.print("메뉴를 선택 (0:정산):");
			
			iMenu =Scanner.nextInt();
			
			if(iMenu==0) {
				System.out.println("오늘의 총 금액은 : "+iTotalMoney);
				break;
			}
	
			if(1<=iMenu && iMenu<=sMenuNameZ.length) {
				int iMenuIdx = iMenu-1;
				
				System.out.println();
				System.out.println(sMenuNameZ[iMenuIdx]+ " 1잔결제 " +iPriceZ[iMenuIdx]+"원 매출증가.");
				iTotalMoney=iTotalMoney+iPriceZ[iMenuIdx];
				System.out.println();
			}else {
				System.out.println();
				System.out.println("없는 메뉴입니다.");
				System.out.println();
			}
		}
		Scanner.close();
		
	}
}
