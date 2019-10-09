import javax.swing.*;

public class Task4_13 {
    public static void main(String[] args) {
        String number;
        number = JOptionPane.showInputDialog("Pleas, input your number: ");
        JOptionPane.showMessageDialog(null, "Your number is " + number);
        Integer integer = Integer.parseInt(number);
        //System.out.println(integer);
        int a = integer / 10;
        int b = integer % 10;
        int count = 0;

        if (a%2==0){
            JOptionPane.showMessageDialog(null, "Even digit is " + a);
            //System.out.println("Even digit is " + a);
            count++;
        }
        if(b%2==0){
            JOptionPane.showMessageDialog(null,"Even digit is " + b);
            //System.out.println("Even digit is " + b);
            count++;
        }
        JOptionPane.showMessageDialog(null, "Number of even digits is " + count);
        //System.out.println("Number of even digits is " + count);
    }
}
