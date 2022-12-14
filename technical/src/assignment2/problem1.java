package assignment2;

public class problem1 {
	public static void main(String args[]) {
		String str1 = new java.util.Scanner(System.in).next();
		int len = str1.length();
		char str[] = str1.toCharArray();
		int i = 0;
		int lennew =len * 2;
		for(int j = 1; i < lennew; i++) {
			if(j == len)
				System.out.println(" ".repeat(i) + str[i] + " ".repeat(i++));
			else
				System.out.println(" ".repeat(i) + str[i] + " ".repeat((len - i) * 2-3 ) + str[i] + " ".repeat(i++));
			if(j >= len) {
				i -=2;
			}
		}
	}
}