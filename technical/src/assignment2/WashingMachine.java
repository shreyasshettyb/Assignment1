//Washing Machine
package assignment2;

public class WashingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=new java.util.Scanner(System.in).nextInt();
		if(w<0)
			System.out.println("INVALID INPUT");
		else if(w>7000)
			System.out.println("OVERLOADED");
		else if(w<=2000)
			System.out.println("25 Minutes");
		else if(w<=4000)
			System.out.println("35 Minutes");
		else
			System.out.println("45 Minutes");
		}
}
