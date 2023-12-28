
package prim_notprim;

import java.util.Arrays;
public class Array_assending {
     public static void main(String[] args) {
    
     int temp=0;
    
      int x[]={3,5,2,0,1,12};
      for(int j=0; j<x.length; j++){
          for(int i=0; i<x.length-1; i++){
            if (x[i]>x[i+1]){
              temp=x[i];
              x[i]=x[i+1];
              x[i+1]=temp;
            }
          }  
      }
    
//       System.out.println(Arrays.toString(x));
        for (int i=0;i<=x.length-1;i++){
            System.out.println(x[i]);
        }
    }
}
