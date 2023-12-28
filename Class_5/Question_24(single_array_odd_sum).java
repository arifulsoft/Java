
package array;

import java.util.Arrays;


public class Arra_2 {
    public static void main(String[] args){
    int x[]= {8,2,6,4,3};
        int sum=0;
        for(int i=0; i<x.length;i++){
            if(x[i]%2!=0){
            sum=sum+x[i];
            }
                   
         
        }
          System.out.println(sum);        
         
            
    }
}
