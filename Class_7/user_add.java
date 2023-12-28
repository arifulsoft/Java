package object;

import java.util.Scanner;

public class user_add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First value");
        int a1 = sc.nextInt();

        System.out.println("Secound value");
        int a2 = sc.nextInt();

        System.out.println("Third value");
        int a3 = sc.nextInt();

        int x = add(a1, a2, a3);
        System.out.println("Sum of three number is: " + x);
    }

    public static int add(int a1, int a2, int a3) {
        int sum = a1 + a2 + a3;
        return sum;
    }
}
