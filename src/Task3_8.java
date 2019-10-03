import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input base b of triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Pleas, input height h of triangle: ");
        double h = scanner.nextDouble();
        double a = Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2) / 4);
        System.out.printf("Side a of triangle equals %.1f%n", a);
        double area = a*h/2;
        double perimeter = a/2 + h + b;
        System.out.printf("Area of triangle equals %.2f%n", area);
        System.out.printf("Perimeter of triangle equals %.2f%n", perimeter);


    }
}
