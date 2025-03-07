import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape (circle, rectangle, square): ");
        String shape = scanner.nextLine().toLowerCase();

        switch (shape) {
            case "circle":
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.printf("Area: %.2f\n", circleArea);
                System.out.printf("Perimeter: %.2f\n", circlePerimeter);
                break;

            case "rectangle":
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                double rectanglePerimeter = 2 * (length + width);
                System.out.printf("Area: %.2f\n", rectangleArea);
                System.out.printf("Perimeter: %.2f\n", rectanglePerimeter);
                break;

            case "square":
                System.out.print("Enter the side length: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                double squarePerimeter = 4 * side;
                System.out.printf("Area: %.2f\n", squareArea);
                System.out.printf("Perimeter: %.2f\n", squarePerimeter);
                break;

            default:
                System.out.println("Invalid shape selected.");
                break;
        }
        scanner.close();
    }
}
