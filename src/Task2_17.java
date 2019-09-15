import java.util.Scanner;

public class Task2_17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas input integer number: ");
        int number = scn.nextInt();
        double n = (double) number;
        int powNumber =(int) Math.pow(n, 2);
        System.out.println("second power of number is: " + powNumber);
    }
}
