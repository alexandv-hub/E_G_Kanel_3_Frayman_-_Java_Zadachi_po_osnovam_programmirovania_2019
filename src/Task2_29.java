import java.util.Scanner;

public class Task2_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input time in hours: ");
        int hours = scanner.nextInt();
        int secundas = hours * 360;
        System.out.println(hours + " hour(s) equils " + secundas + " secundas");

    }
}
