package assignment2;
import java.util.Scanner;
public class Vehicles {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();
		if(w < 2 || w % 2 != 0 || w <= v) {
			System.out.println("INVALID INPUT");
			return;
		}
		int f = (w - 2 * v) / 2;
		int t = v - f;
		System.out.println(t + " " + f);
	}
}