//Valid String
package assignment2;

public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1=0,c2=0;;
		String s=new String();
		s=new java.util.Scanner(System.in).next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
				c1++;
			else 
				c2++;
			
		}
			System.out.println(c1-c2);
	}

}
