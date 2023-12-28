
package Day_07;
import java.util.Scanner;
public class NewClass1 {
     public static void main(String[] args) {
         /*
         Scanner sc= new Scanner(System.in);
         System.out.println("enter a value");
         double p1=sc.nextDouble();
          System.out.println("enter a value");
         double p2=sc.nextDouble();
          System.out.println("enter a value");
         double p3=sc.nextDouble();
      double add=m1(p1,p2,p3);   
         System.out.println(add);
         */
         
         
         /*
         double add=m1(3,21,5);   
         System.out.println(add);
         */
         
        double fd=d1();
         System.out.println(fd);
         
     }
     /*
     public static double m1(double p1, double p2, double p3){
       double sum=p1+p2+p3;
       return sum;
     }
     */
     public static double d1(){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter a value");
         double p1=sc.nextDouble();
          System.out.println("enter a value");
         double p2=sc.nextDouble();
          System.out.println("enter a value");
         double p3=sc.nextDouble();
         double sum=p1+p2+p3;
         return sum;
     }     
}
