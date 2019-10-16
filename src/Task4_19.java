import javax.swing.*;

public class Task4_19 {
    public static void main(String[] args) {
      String number = JOptionPane.showInputDialog("Pleas, input your number ");
      JOptionPane.showMessageDialog(null, "Your number is " + number);
      int numb = Integer.parseInt(number);
      int a = numb/1000;
      int b = numb%1000/100;
      int c = numb%100/10;
      int d = numb%10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        String numberChenged = (a+1)+""+(b+1)+""+(c+1)+""+(d-d);
        JOptionPane.showMessageDialog(null, "Your changed number is " + numberChenged);














































































    }
}
