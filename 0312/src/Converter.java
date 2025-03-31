import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int isec, imin, ihour, iday, iTotalSec;
		
		Scanner oInDev;
		oInDev= new Scanner(System.in);
		
		System.out.printf("Enter positive second: ");
		iTotalSec=oInDev.nextInt();
		
		isec=iTotalSec%60;
		imin=iTotalSec/60;
		
		ihour=imin/60;
		imin=imin%60;
		
		
		iday=ihour/24;
		ihour=ihour%24;
		
		System.out.print(iday +"일" + ihour + "시간" + imin+"분" +isec+"초");
		//System.out.printf("%d일 %d시간 %d분 %d초", iday, ihour, imin, isec);
		
		oInDev.close();
	}

}
