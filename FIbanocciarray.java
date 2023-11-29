package sde.program.analysis;
import java.util.Scanner;
public class FIbanocciarray {
     public static void main(String[] args){
         int n,i;
         Scanner input=new Scanner (System.in);
         n=input.nextInt();

         int fib[]=new int[n+2];
         fib[0]=0;
         fib[1]=1;
         System.out.print(fib[0]+" "+ fib[1]);
         for(i=2;i<n;i++){
             fib[i]=fib[i-1]+fib[i-2];
             System.out.print(fib[i]+" ");
         }

     }
}
