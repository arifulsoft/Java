package Day_07;

public class Mobile {

    public static void main(String[] args) {
        System.out.println("A");
        m2();
        System.out.println("B");
        m1();
        m2();
        m2();
        int x = m3();
        System.out.println(x);
        String y = m4();
        System.out.println(y);

        int x1 = add();
        System.out.println("Summation is = " + x1);

        int x2 = subtr();
        System.out.println("Subtraction is = " + x2);

        double x3 = div();
        System.out.printf("Division is = " + "%.2f\n", x3);
        
        int x4 = mul();
        System.out.println("Multiplication is = " + x4);
        
         int x5 = m7(9);
        System.out.println("Square is = " + x5);
        
        int x6 = m8(3,5);
        System.out.println("Sum of square is = " + x6);
    }
    
    public static void m1() {
        System.out.println("Hello");
    }

    public static void m2() {
        System.out.println("Mobile");
    }

    public static int m3() {
        return 10;
    }

    public static String m4() {
        return "Bangladesh";
    }

    public static int add() {
        int a = 3;
        int b = 5;
        int c = a + b;
        return c;
    }

    public static int subtr() {
        int a = 5;
        int b = 3;
        int c = a - b;
        return c;
    }

    public static double div() {
        double a = 5;
        double b = 3;
        double c = a / b;
        return c;
    }

    public static int mul() {
        int a = 5;
        int b = 3;
        int c = a*b;
        return c;
    }
    public static int m7(int y) {
        int dd=y*y;
        return dd;
    }
    public static int m8(int x,int y) {
        int pp=x*x;
        int dd=y*y;
        int sd=pp+dd;
        return sd ;
    }
      public static int m9(int x,int y,int z) {
        int sum=x+y+z;
        return sum ;
    }

    }
