package sde.program.analysis;
import java.util.Scanner;

public class FIbanocci {
    public static int f1(int n){
        if(n<=1)
            return n;
        return f1(n-2) + f1(n-1);
    }

    public static void main(String args[]){
        int n1,n2,n3,i,n;
        n1=0;
        n2=1;
        i=0;

        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(i=2;i<n;i++){
            System.out.print(f1(i)+" ");
        }

    }
}
