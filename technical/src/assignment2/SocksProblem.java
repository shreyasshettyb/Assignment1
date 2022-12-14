package assignment2;

import java.util.*;

class SocksProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int i;
		System.out.println("Enter the values");
		int ar[] = new int[n];
		for(i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		Arrays.sort(ar);
		int count = 0;
		for(i = 0; i < n - 1; i++){
			if(ar[i] != ar[i + 1])
				count++;
			else
				i++;
		}
		if(i == n - 1)
			count++;
		System.out.println("Count: " + count);
	}
}