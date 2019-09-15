import java.util.Scanner;

public class Task2_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input first side of parallelepiped: ");
        int a = scn.nextInt();
        System.out.println("Pleas, input second side of parallelepiped: ");
        int b = scn.nextInt();
        System.out.println("Pleas, input third side of parallelepiped: ");
        int c = scn.nextInt();
        int volume = a* b * c;
        int areaAB = a*b;
        int areaAC = a*c;
        int areaBC = b*c;
        int areaOfParallelepiped = 2*(areaAB+areaAC+areaBC);
        int pirimeter = 4*(a+b+c);
        System.out.println("volume of parallelepiped equils: " + volume);
        System.out.println("areaAB equils: " + areaAB);
        System.out.println("areaAC equils: " + areaAC);
        System.out.println("areaBC equils: " + areaBC);
        System.out.println("Area of parallelepiped equils: " + areaOfParallelepiped);
        System.out.println("Pirimeter of parallelepiped equils: " + pirimeter);

    }
}
