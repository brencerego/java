package brence;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What do you want to convert:\n1. Celsius into fahrenheit\n2. Fahrenheit into Celcius\nInput:");
            int n = sc.nextInt();

            if (n==1){
                System.out.println("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "C is " + fahrenheit + "F");
            }
            else {
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "F is " + celsius + "C");
            }
        }
    }
}
