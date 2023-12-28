package object;

public class Mobail {

    public static void main(String[] args) {
        System.out.println("A");
        m1();
        System.out.println("B");
        m2();
        m2();
        int x = m3();
        System.out.println(x);
        String y = m4();
        System.out.println(y);
        int z = add();
        System.out.println("Samesstion is:" + z);

        int w = sub();
        System.out.println("Substrain is:" + w);

        int i = malty();
        System.out.println("Malty is:" + i);

        int j = dive();
        System.out.println("dive is:" + j);

        int f = Squer(5);
        System.out.println("Squer is:" + f);

        int f1 = q1();
        System.out.println("Squer is:" + f1);

        int f2 = Squer1(5,3);
        System.out.println("Um of squer is:" + f2);
    }

    public static void m1() {
        System.out.println("Hello");
    }

    public static void m2() {
        System.out.println("Mobail");
    }

    public static int m3() {
        return 10;
    }

    public static String m4() {
        return "Bangladesh";
    }

    public static int add() {
        int a = 5;
        int b = 3;
        int c = a + b;
        return c;

    }

    public static int sub() {
        int t = 5;
        int u = 3;
        int d = t - u;
        return d;

    }

    public static int malty() {
        int t = 5;
        int u = 3;
        int d = t * u;
        return d;

    }

    public static int dive() {
        int n = 15;
        int m = 3;
        int v = n / m;
        return v;

    }

    public static int Squer(int k) {
        int a1 = k * k;

        return a1;
    }

    public static int q1() {
        int n = 3;

        int a2 = n * n;
        return a2;
    }

    public static int Squer1(int k, int w1) {
        int a1 = k * k;
        int a2 = w1 * w1;
        return a1 + a2;
    }

}
