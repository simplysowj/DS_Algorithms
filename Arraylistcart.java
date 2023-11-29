package sde.program.analysis;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Arraylistcart {
    public static void main(String[] args){
        ArrayList<Integer> userCart=new ArrayList<Integer>();
        int choice;
        Scanner input= new Scanner(System.in);
        do{
            System.out.print("Pick a product to add to cart: \n1. Milk\n2. Bread\n3. Butter\n4. Show cart\n");
            choice=input.nextInt();
            userCart.add(choice);

        }while(choice>0 && choice<=3);
        Collections.sort(userCart);
        userCart.remove(userCart.size()-1);
        userCart.set(userCart.size()-1,userCart.size()-1);
        int p1 = Collections.frequency(userCart,1);
        int p2 = Collections.frequency(userCart,2);
        int p3 = Collections.frequency(userCart,3);

        System.out.println("Your cart contains:"+userCart);
        System.out.println("Product 1 x "+p1);
        System.out.println("Product 2 x "+p2);
        System.out.println("Product 3 x "+p3);
        System.out.println("Your cart contains:"+userCart);

    }



}
//1.Declare the arraylist
//2.Display the products
//3.Read the choice and store in cart
//4.sort the cart
//5.Display the cart