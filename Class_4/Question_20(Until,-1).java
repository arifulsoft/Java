
package prim_notprim;
import java.util.Scanner;
public class until_120 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your value");
          int num1=sc.nextInt();
          int sum=0;
            while(num1!=-1){
             sum= sum+num1;
            num1=sc.nextInt();
            }
            System.out.println("Summestion until -1: "+sum);
           
          }
      }