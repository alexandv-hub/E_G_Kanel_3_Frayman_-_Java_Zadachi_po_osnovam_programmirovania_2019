import java.util.Scanner;

public class Task2_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input first side of rectangle: ");
        int a = scn.nextInt();
        System.out.println("Pleas, input second side of rectangle: ");
        int b = scn.nextInt();
        int areaRectangle = a * b;
        int pirimeterRectangle = 2 * (a + b);
        System.out.println("Area of rectangle equils: " + areaRectangle);
        System.out.println("Pirimeter of rectangle equils: " + pirimeterRectangle);
    }
}
