import javax.swing.*;

public class Task4_15 {
    public static void main(String[] args) {
        String inputNumber = JOptionPane.showInputDialog("Pleas, input your number in format XXXX");
        Integer number = Integer.parseInt(inputNumber);
        JOptionPane.showMessageDialog(null, "Your number is " + number);
        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number % 100 / 10;
        int d = number % 10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        int count = 0;
        if (a%2==0){
            JOptionPane.showMessageDialog(null, "Digit " + a + " of your number is even");
            count++;
        }
        if (b%2==0){
            JOptionPane.showMessageDialog(null, "Digit " + b + " of your number is even");
            count++;
        }
        if (c%2==0){
            JOptionPane.showMessageDialog(null, "Digit " + c + " of your number is even");
            count++;
        }
        if (d%2==0){
            JOptionPane.showMessageDialog(null, "Digit " + d + " of your number is even");
            count++;
        }
        JOptionPane.showMessageDialog(null, "Number of even digits is " + count);

    }
}
