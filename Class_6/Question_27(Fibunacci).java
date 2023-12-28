package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibunacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        int n = sc.nextInt();
        ArrayList pp = new ArrayList();
        int arr[] = {1, 4, 5, 7,};
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if (n == 1) {
            pp.add(n1);
        }
        if (n == 2) {
            pp.add(n1);
            pp.add(n2);
        }
        if (n > 2) {
            pp.add(n1);
            pp.add(n2);
            for (int i = 2; i < n; i++) {

                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
                pp.add(sum);
            }
        }
        System.out.println(pp);
    }
}
