public class Task5_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = -3;
        int c = 9;
        boolean a1 = (a+b)*3==-9;//true
        boolean a2 = b*a==c*(-a);//true
        boolean a3 = c/b==b*(-1);//false
        boolean a4 = (-b)*(-b)>=c;//true
        double d1 = (double)b/(-c);
        double d2 = (double)1/b;

        boolean a5 = d1==d2;//false
        boolean b1 = 80>=80;//true
        boolean b2 = b*b!=a*c;//true
        boolean b3 = b<a;//true
        boolean b4 = b*b==c;//true
        boolean b5 = -c/b==-b;//true
        System.out.println("a1 = "+ a1);
        System.out.println("a2 = "+ a2);
        System.out.println("a3 = "+ a3);
        System.out.println("a4 = "+ a4);
        System.out.println("a5 = "+ a5);
        System.out.println("b1 = "+ b1);
        System.out.println("b2 = "+ b2);
        System.out.println("b3 = "+ b3);
        System.out.println("b4 = "+ b4);
        System.out.println("b5 = "+ b5);




    }
}
