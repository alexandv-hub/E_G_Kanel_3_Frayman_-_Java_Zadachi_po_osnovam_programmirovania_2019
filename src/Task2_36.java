import java.util.Scanner;

public class Task2_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input name passenger: ");
        String namePassenger = scanner.nextLine();
        System.out.println("Pleas, input site of destination: ");
        String destination = scanner.nextLine();
        System.out.println("Passenger " + namePassenger + " has departure at " + destination);
    }
}
