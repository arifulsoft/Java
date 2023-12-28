
package prim_notprim;

import java.util.Scanner;
public class factorial {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your value");
          int num1=sc.nextInt();
          int p=1;
      if(num1<=1){
         System.out.println(p);
       }else{
        for(int i=1; i<=num1; i++) {
         p=p*i;
        }
         System.out.println("Factorial number is: "+p);

       }
}
}