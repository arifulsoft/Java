
package addition;
import java.util.Scanner;
public class Q6 {
     public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Number");
       double x=sc.nextDouble();
       
       System.out.println("Enter your Number");
       double y=sc.nextDouble();
       
        System.out.println("Enter your Number");
       double z=sc.nextDouble();
        if(x<y && x<z){
             System.out.println("Smollest number"+x);
        }else if(y<x&& y<z){
       System.out.println("Smollest number"+y);
        
        }else{
            System.out.println("Smolest number"+z);
        }

}
}