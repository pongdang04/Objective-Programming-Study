import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int iInput, iEmptySpace, floor, iOneFloor, iOdd;
		Scanner oInDev = new Scanner(System.in);
		
		//양수 && 홀수조건을 만족하는 수 저장받기
		while(true) {
			System.out.print("0이상의 홀수 정수를 입력하세요 : ");
			iInput = oInDev.nextInt();
			
			if(iInput>0) {
				iOdd = iInput%2;
				if(iOdd == 1) {
					break;
				}
			}
			System.out.println("홀수를 입력해주세요.");
		}	
		
		floor = iInput/2+1;
		
		//삼각형 출력
		for(int i=0;i<floor;i++) {
			iOneFloor = i*2+1;
			iEmptySpace = (iInput-iOneFloor)/2;
			
			//빈 공간 출력
			for(int j=0;j<iEmptySpace;j++) {
				System.out.print(" ");
			}
			
			//별 출력
			for(int j=0;j<iOneFloor; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		oInDev.close();
	}
}
