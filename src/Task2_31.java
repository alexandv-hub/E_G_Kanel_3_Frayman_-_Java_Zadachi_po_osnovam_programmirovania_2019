import java.util.Scanner;

public class Task2_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your mass: ");
        int mass = scanner.nextInt();
        System.out.println("Pleas, input your speed: ");
        int speed = scanner.nextInt();
        int E = (int)(mass * Math.pow(speed, 2.0)/2);
        System.out.println("Kinetic energy is " + E + " J");
    }
}
