
package project5;
import java.util.Scanner;
public class Question2 {
     public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Number");
       double x=sc.nextDouble();
       
       System.out.println("Enter your Number");
       double y=sc.nextDouble();
       
        System.out.println("Enter your Number");
       double z=sc.nextDouble();
        if(x>y && x>z){
             System.out.println("Meximam number"+x);
        }else if(y>x&& y>z){
       System.out.println("Meximam number"+y);
        
        }else{
            System.out.println("Meximam number"+z);
        }

}
}