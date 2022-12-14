package assignment2;

public class steps {

	public static void main(String[] args) {
			System.out.println("Enter Number Of Turns:");
		int s=new java.util.Scanner(System.in).nextInt();
		if(s>=0)
		{
			int xaxis = 0, yaxis = 0; 
			for(int i = 0; i < s; i++) {
				int d=(i + 1) * 10;
				switch(i % 5) {
				case 0: xaxis +=d;
						break;
				case 1: yaxis += d;
						break;
				case 2: xaxis -= d;
						break;
				case 3: yaxis -= d;
						break;
				case 4: xaxis += d;
				}
			}
			System.out.println(xaxis+","+yaxis);
		}

	}
}

