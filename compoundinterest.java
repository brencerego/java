package brence;
import java.util.Scanner;
import java.lang.Math;

public class Compound { 
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
	int P = sr.nextInt();
	System.out.print("Enter Rate of Interest:");
	double R = sr.nextDouble();
	System.out.print("Enter the Time Period:");
	int n = sr.nextInt();			
	double CI = P * (Math.pow(1 + (R/100),n));
	System.out.println("The Compound Interest After "+n+" years is "+CI);
	scanner.close();
        }
}
