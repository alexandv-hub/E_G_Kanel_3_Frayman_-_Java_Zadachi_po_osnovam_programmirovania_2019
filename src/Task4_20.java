import javax.swing.*;

public class Task4_20 {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Pleas, input your number");
        int integerNumber = Integer.parseInt(number);
        int a = integerNumber/1000;
        int b = integerNumber/100%10;
        int c = integerNumber%100/10;
        int d = integerNumber%10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        int changedNumber = (a+1)*1000+(b+1)*100+(c+1)*10+a;
        JOptionPane.showMessageDialog(null, changedNumber);

    }
}
