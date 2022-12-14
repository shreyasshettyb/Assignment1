package assignment2;
import java.util.Scanner;
public class Chocolate {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int chocoArray[] = new int[n];
int not0 = 0;
for(int i = 0; i < n; i++) {
int choco = sc.nextInt();
if(choco != 0)
chocoArray[not0++] = choco;
}
for(int i = 0; i < n; i++)
System.out.print(chocoArray[i] + " ");
System.out.println();
}
}