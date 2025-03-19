
public class Multiplication_Table {

	public static void main(String[] args) {
		int iFirst, iSec, iLines;
		int tmp,iCntFirst, iCntSec;
		
		for(int k=0;k<3;k++) {
			for(int j=0;j<9;j++) {
				iCntFirst=j+1;
				for(int i=0;i<3;i++) {
					iCntSec=i+1+k*3;
					tmp=iCntSec*iCntFirst;
					if(tmp<10) {
						System.out.print(iCntSec + " * " + iCntFirst+ " =  " + tmp + "     ");
					}else {
						System.out.print(iCntSec + " * " + iCntFirst+ " = " + tmp + "     ");
					}
					
					//System.out.printf("%d * %d = %2d    ",iCntSec, iCntFirst,tmp);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("==========================================");
			System.out.println();
		}
		
	}

}
