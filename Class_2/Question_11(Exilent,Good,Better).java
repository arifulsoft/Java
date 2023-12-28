
package Project5;
import java.util.Scanner;
public class Question7 {
    public static void main(String [] args){
 Scanner input=new Scanner(System.in); 
 
 int number;
 System.out.println("Enter your first Number:");
 number=input.nextInt();
   
     if(number>=80){
     System.out.println("Excilent");   
}else if(number>=60){
     System.out.println("Good");   
}else if(number>=40){
     System.out.println("Bad");   
}
    }
}