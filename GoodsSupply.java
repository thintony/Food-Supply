import java.util.Scanner;

public class GoodsSupply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numSupply = 0;
		int numTruck = 1;
		int yamSupply = 0;
		int beansSupply = 0;
		
		while(numTruck <= 10) {
			System.out.println("Enter numsSupply(1 = YamSupply, 2 =beansSupply)");
		 numSupply = scanner.nextInt();
		 if(numSupply >= 3) {
			 System.out.println("NOT VALID");
			continue;
			}
		else	
			if(numSupply == 1)
				yamSupply = yamSupply +1;
			else
				beansSupply = beansSupply + 1;
			
			numTruck = numTruck + 1;
				
		}
		
		System.out.printf("%n%nYamSupply:%n%d%n%n "
				+ "BeansSupply:%n%d", yamSupply,beansSupply);
	}

}
