package assignment2;

public class Vowels {
	public  static void main(String args[]) {
			String s = new java.util.Scanner(System.in).next();
			char vow[] = s.toCharArray();
			for(int i = 0; i < s.length(); i++) {
				if(vow[i] == 'e')
					vow[i] = 'o';
				else if(vow[i] == 'o')
					vow[i] = 'e';
				else if(vow[i] == 'i')
					vow[i] = 'u';
				else if(vow[i] == 'u')
					vow[i] = 'i';
			}
			System.out.println(new String(vow));
	}

}
