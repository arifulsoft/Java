
package array;

import java.util.Arrays;


public class tow_d_array {
    public static void main(String[] args) {
    
   
    
       int[][] x={
           {4,9,5,7,1},
           {5,8,1,2,4},
           {10,8,9,4}
       };
    int tamp=0;
    for(int k=0;k<x.length;k++ ){
        int[] a=x[k];
      for(int j=0;j<a.length-1;j++){
          for(int i=0; i<a.length-j-1;i++){
            if(a[i]>a[i+1]){
              tamp=a[i];
              a[i]=a[i+1];
              a[i+1]=tamp;
            }
         }
      }
         System.out.println (Arrays.toString(a));
        
    }
  }        
    }


