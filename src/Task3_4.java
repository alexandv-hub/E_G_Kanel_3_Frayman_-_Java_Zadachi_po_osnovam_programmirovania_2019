import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input sum your money in $: ");
        double sum = scanner.nextDouble();
        System.out.println("Pleas, input course $ to gr: ");
        double course = scanner.nextDouble();
        double sumInGr = sum * course;
        System.out.println("Your sum i gr equils " + sumInGr + " gr");
    }
}
