package assignment2;

public class Consonant {

	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).next();
		char vow[] = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(vow[i] == 'c')
				vow[i] = 't';
			else if(vow[i] == 't')
				vow[i] = 'c';
			else if(vow[i] == 'd')
				vow[i] = 'n';
			else if(vow[i] == 'n')
				vow[i] = 'd';
		}
		System.out.println(new String(vow));;

	}

}
