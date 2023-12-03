package Hash;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FIrstUniqueCharacter {
    public static void main (String[] args){
        Scanner in=new Scanner (System.in);
        String str=in.nextLine();
        Character FirstUniqueChar=null;
        Map<Character,Integer>h=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);

            }
            else{
                h.put(ch,h.get(ch)+1);
            }

        }
        for(Character ch :h.keySet()){
            if(h.get(ch)==1){
                FirstUniqueChar=ch;
                break;
            }
        }
        if(FirstUniqueChar==null){
            System.out.println("No unique chars");

        }
        else{
            System.out.println(FirstUniqueChar);
        }

    }
}
