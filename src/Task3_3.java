import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your value: ");
        double value = scanner.nextDouble();
        System.out.println("You inputed value " + value + " inches");
        double valueSm = value * 2.54;
        System.out.println("It equils " + valueSm + " santimetres");
    }
}
