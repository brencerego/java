import java.util.Scanner;
public class Person {
    private String name;
    private int age;
	
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
     public void displayInfo() {
         System.out.println("Name: " + name);
	 System.out.println("Age: " + age);
    }

     public static void main(String[] args) {
        Scanner s = new Scanner (System.in)
	System.out.print("Enter the Name");
	String name = s.next()
	System.out.print("Enter the Age:");
	int age= s.nextInt();
	Person person = new Person(name,age);
	person.displayDetails();
    }
}
