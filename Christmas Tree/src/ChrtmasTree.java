import java.util.Scanner;

public class ChrtmasTree {

	public static void main(String[] args) {
		int iInput, floor,iOneFloor,iEmptySpace;
		
		Scanner oInDev;
		oInDev= new Scanner(System.in);
		
		while(true) {
			System.out.printf("Enter odd number: ");
			iInput=oInDev.nextInt();
			if(iInput==0) {
				System.out.print("Shut down the system...");
				break;
			}
			
			floor = iInput/2+1;
			
			for(int i=0;i<floor;i++) {
				iOneFloor = i*2+1;
				iEmptySpace = (iInput-iOneFloor)/2;
				
				for(int j=0;j<iEmptySpace;j++) {
					System.out.print(" ");
				}
				
				for(int j=0;j<iOneFloor; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		oInDev.close();
	}

}
