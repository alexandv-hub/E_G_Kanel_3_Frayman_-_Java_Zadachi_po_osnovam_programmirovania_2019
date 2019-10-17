public class Task5_4 {
    public static void main(String[] args) {
        int x = -2;
        int y = 5;
        int z = 13;
        boolean a = (z>x)||(x<0)&&(z-y>9);//true prioritet && nad ||
        System.out.println(a);
    }
}
