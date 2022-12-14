package assignment2;
public class Supermarket {

	public static void main(String[] args) {

		String s= new String();
		s=new java.util.Scanner(System.in).next();
		long len=s.length();
		long mul=Character.getNumericValue(s.charAt(0));
		for(int i=1;i<len;i++) {
			mul=mul*Character.getNumericValue(s.charAt(i));
		}
		System.out.println(mul);

	}

}
