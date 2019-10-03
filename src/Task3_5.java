import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input value side a: ");
        double a = scanner.nextDouble();
        System.out.println("Pleas, input value side b: ");
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("value side %.1f %n", c);
        double area = (a * b) / 2;
        double perimeter = a + b + c;
        System.out.printf("Area of tringle equils %.1f%n", area);
        System.out.printf("Perimeter of tringle equils %.1f%n", perimeter);


    }
}