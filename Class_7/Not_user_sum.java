package object;

import java.util.Scanner;

public class user_sum {

    public static void main(String[] args) {
        int a1 = add(5, 6, 2);
        System.out.println("add is:" + a1);
    }

    public static int add(int x, int y, int z) {

        int c = x + y + z;
        return c;
    }
    
    
}
