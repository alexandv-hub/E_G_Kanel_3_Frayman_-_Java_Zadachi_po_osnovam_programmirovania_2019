import javax.swing.*;

public class Task4_16 {
    public static void main(String[] args) {
        String stringNumber = JOptionPane.showInputDialog("Pleas, input your number in format XXXX: ");
        Integer number = Integer.parseInt(stringNumber);
        JOptionPane.showMessageDialog(null, "Your present number is " + number);
        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number % 100 / 10;
        int d = number % 10;
        JOptionPane.showMessageDialog(null, "Your changed number is " + d + "" + b + "" + c + "" + a);
    }
}
