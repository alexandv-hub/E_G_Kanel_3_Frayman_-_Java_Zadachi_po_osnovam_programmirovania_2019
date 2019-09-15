import java.util.Scanner;

public class Task2_21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scn.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(++number);

        }
    }
}
