
package Project5;

import java.util.Scanner;
public class Question3 {
   public static void main(String [] args){
 Scanner input=new Scanner(System.in); 
 
 int number1,number2,sum,sub,malti,div;
 System.out.println("Enter your first Number:");
 number1=input.nextInt();
 
 System.out.println("Enter your first Number:");
 number2=input.nextInt();
 
 sum=number1+number2;
 sub=number1-number2;
 malti=number1*number2;
 div=number1/number2;
 
  
   System.out.println("Sumession:"+sum);
   System.out.println("Submisson:"+sub);
   System.out.println("Malti:"+malti);
     System.out.println("divesion:"+ div);
   
 
}
}