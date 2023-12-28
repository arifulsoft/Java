
package prim_notprim;
import java.util.Scanner;
public class primnotprim19 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
        if(num1%i==0){
         count++;
        }
        }if(count==2){
        System.out.println("Prime number");
        }else{
        System.out.println("Not prime number");
        }        
}
}