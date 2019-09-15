import java.util.Calendar;
import java.util.Scanner;

public class Task2_26 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
       int year = calendar.get(Calendar.YEAR);
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input year of your birthday: ");
        int yearBirthday = scn.nextInt();
        System.out.println("Your age equils " + (year-yearBirthday) + " years");

    }
}
