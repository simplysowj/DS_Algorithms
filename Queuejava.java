
import java.util.Queue;
import java.util.LinkedList;
public class Queuejava {
    public static void main (String[]args){
        Queue <Integer> myQueue=new LinkedList<Integer>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        for (Integer i : myQueue)
            System.out.print(i+" ");
        System.out.println();

        myQueue.remove();
        for (Integer i : myQueue)
            System.out.print(i+" ");
        System.out.println();
        if(myQueue.contains(20))
            System.out.println("20 found");
        else
            System.out.println("20 not found");



    }
}
