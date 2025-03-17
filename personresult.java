package brence;
import java.util.Scanner;
class Person1 {
	String name;
	int age;
	
	public void readDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and age:");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
	}

}

class Student extends Person1
{
	int regNo;
	double m1,m2,m3,total,avg;
	String result;
	
	public void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Regno and marks in 3 subjects");
		regNo= sc.nextInt();
		sc.nextLine();
		m1 =sc.nextDouble();
		sc.nextLine();
		m2 =sc.nextDouble();
		sc.nextLine();
		m3 =sc.nextDouble();
		sc.nextLine();											
	}
	
	public void calResult()
	{
		total = m1 + m2 + m3;
		avg = total/3.0;
		if(avg>80)
			result= "Distinction";
		else if(avg>60)
			result = "First Class";
		else if(avg>50)
			result = "Second Class";
		else if(avg>=40)
			result = "Just Pass";
		else
			result="Fail";
		
	}
	
	public void displayDetails()
	{
		System.out.print(" \t| " + name);
		System.out.print(" \t| " + age);
		System.out.print(" \t| " + regNo);
		System.out.print(" \t| " + m1);
		System.out.print(" \t| " + m2);
		System.out.print(" \t| " + m3);
		System.out.print(" \t| " + total);
		System.out.print(" \t| " + avg);
		System.out.print(" \t| " + result);
		System.out.println();
	}
		
}

public class Person {
public static void main(String[] args)
{
Student[] s= new Student[20];
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter total number of students: ");
n=sc.nextInt();
for(int i=0;i<n;i++) {
s[i]= new Student();
s[i].readDetails();
s[i].getDetails();
s[i].calResult();
}
System.out.println(" \t______________________________________________________________________________________");
System.out.println(" \t|Name\t|Age\t|Reg No\t|M1\t|M2\t|M3\t|Total\t\t|Avg\t|Result|");
System.out.println(" \t______________________________________________________________________________________");

for(int i=0;i<n;i++)
	s[i].displayDetails();
System.out.println(" \t______________________________________________________________________________________");



	
}
}
