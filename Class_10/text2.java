package inheritance;

public class text2 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new A1(10, "Dhaka");
        B1 a3 = new B1(40, 20);
      

        System.out.println(a1.x);
        System.out.println(a2.y);
        System.out.println(a3.p);
        System.out.println(a3.q);
    }
}
