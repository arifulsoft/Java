
package project6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class email {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String x="^[a-zA-Z]+\\@[a-z]+\\.[a-z]{2,3}$";
        System.out.println("Enter your email id");
        String y=sc.nextLine();
        
        
        Pattern P=Pattern.compile(x);
        Matcher M=P.matcher(y);
        boolean b=M.matches();
        System.out.println(b);
        
       if(b==true){
        System.out.println("Valit email");
        
       }else{
         System.out.println("Invalit email");  
       }
    }
    
}
