package brence;
import static java.lang.Float.sum; 
import java.util.Scanner;  
public class Main {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  x, average, sum= 0;   
      Scanner sc = new Scanner(System.in);     
      System.out.print("Enter the value of n ");  
      n = sc.nextInt();  
      while (count <= n)   
             {   
                  System.out.print("Enter the "+count+ " number: ");  
                  x = sc.nextInt();  
                  sum+=x;   
                  ++count;   
             }   
                  average = sum/n;   
        System.out.println("The Average is "+average);  
    }    
}  
