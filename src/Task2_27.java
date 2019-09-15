import java.util.Scanner;

public class Task2_27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input your weight in grm: ");
        double weight = scn.nextInt();
        double weightKG = weight / 1000;
        System.out.println("Your weight in kg equils: " + weightKG + " kg");

    }
}
