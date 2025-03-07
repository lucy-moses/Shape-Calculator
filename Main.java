/*
Name: Ugwuaneke lucy ifeoma
PRN: 23070126169
Batch: 2023 -2027
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n--- Shape Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.calculateShape();
                    break;

                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.calculateShape();
                    break;

                case 3:
                    System.out.print("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.calculateShape();
                    break;

                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.calculateShape();
                    sphere.calculateVolume();
                    break;

                case 5:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double cylinderHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    cylinder.calculateShape();
                    cylinder.calculateVolume();
                    break;

                case 6:
                    System.out.print("Enter base edge of the pyramid: ");
                    double baseEdge = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseEdge, pyramidHeight);
                    pyramid.calculateShape();
                    pyramid.calculateVolume();
                    break;

                case 7:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}