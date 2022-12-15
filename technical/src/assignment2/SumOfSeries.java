package assignment2;

public class SumOfSeries {

	public static void main(String[] args) {
		double sum=0,fact = 1;
		int f=0;
		int n= new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			if(f==0)
			{
				sum+=(i/fact);
				f++;
			}
			else
			{
				sum-=(i/fact);
				f--;
			}
		}
		System.out.println("Sum= "+sum);
	}
}
