import java.util.Scanner;

public class Task2_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas input integer number: ");
        int number = scn.nextInt();
        double n = (double) number;
        int secondPowNumber =(int) Math.pow(n, 2);
        int thirdPowNumber =(int) Math.pow(n, 3);
        System.out.println("second and third power of number is: " + secondPowNumber + "&" + thirdPowNumber);
    }
}
