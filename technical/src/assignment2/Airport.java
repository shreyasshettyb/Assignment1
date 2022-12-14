package assignment2;
import java.util.*;
public class Airport{
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N");
			int n = sc.nextInt();
			System.out.println("Enter elements");
			int r0=0,r1 = 0,r2 = 0;
			for(int  i = 0; i < n; i++) {
				int b = sc.nextInt();
				switch(b){
				case 1: r1++;
						break;
				case 2: r2++;
						break;
				case 0: r0++;
						break;		
				}
			}
			System.out.println("0 ".repeat(r0) + "1 ".repeat(r1) + "2 ".repeat(r2));
		}

}
