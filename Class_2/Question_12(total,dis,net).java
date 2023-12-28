
package Project5;
import java.util.Scanner;
public class Question8 {
    public static void main(String [] args){
 Scanner input=new Scanner(System.in); 
 
 double number1,number2,number3,number4,total;
 System.out.println("Product 1:");
 number1=input.nextDouble();
 
 System.out.println("Product 2");
 number2=input.nextDouble();
 
 System.out.println("Product 3");
 number3=input.nextDouble();
 
 System.out.println("Product 4");
 number4=input.nextDouble();
 
  total=number1+number2+number3+number4;
   double dis=0;
   double net=0;
   if(total>=5000){
      dis= total*.15;
    net=total-dis;
   } else if(total>=2000){
     dis = total*.10;
 net=total-dis;
   }else if(total>=1000){
     dis = total*.5;
    net=total-dis;
   }
   System.out.println("Total number is: "+total);
   System.out.println("Discount: "+dis);
     System.out.printf("Net many: %.2f ",net);
   
    }
}