
package Project5;
import java.util.Scanner;
public class Question6 {
    public static void main(String [] args){
 Scanner input=new Scanner(System.in); 
 
 int number;
 System.out.println("Enter your first Number:");
 number=input.nextInt();
   
     if(number>=80){
     System.out.println("A+");   
}else if(number>=60){
     System.out.println("A");   
}else if(number>=40){
     System.out.println("B");   
}
    }
}