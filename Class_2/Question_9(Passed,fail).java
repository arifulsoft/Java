
package Project5;

import java.util.Scanner;
public class Question5 {
    public static void main(String [] args){
 Scanner input=new Scanner(System.in); 
 
 int number;
 System.out.println("Enter your first Number:");
 number=input.nextInt();
    if(number>=60){
    System.out.println("Pass");
    }else if(number<60){
     System.out.println("Fail");
    }
    }
}
