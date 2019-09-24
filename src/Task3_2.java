import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your length at sm: ");
        double length = scanner.nextDouble();
        double inchLength = length / 2.54;
        System.out.println("Your length in inches equils " + inchLength);
    }
}
