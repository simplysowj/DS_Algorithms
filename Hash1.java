package Hash;
import java.util.*;
public class Hash1 {
    public static void main (String[] args){
        Hashtable<Integer,String>ht= new Hashtable<Integer,String>();
        ht.put(1,"Alex");
        ht.put(2,"B");
        ht.put(3,"c");
        ht.put(4,"D");
        System.out.println(ht);
        System.out.println(ht.get(2));
        System.out.println(ht.contains("b"));
        System.out.println(ht.contains("B"));
        System.out.println(ht.containsKey(2));
        for(var e:ht.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        ht.remove(2);
        System.out.println(ht);
        ht.clear();
        System.out.println(ht);


    }
}
