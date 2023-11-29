package sde.program.analysis;

public class ParenthesisMatching {
    public static boolean match (String parens) throws Exception
    {
        int count1=0;
        int count2=0;
        char[] chars = parens.toCharArray();
        for(char c: chars)
        {
            if(c=='(')
                count1++;

            else if(c==')') {
                if (count1 > 0)
                    count1--;
                else
                    return false;
            }
            else if(c=='{')
            count2++;
            else if(c=='}') {
                if (count2 > 0)
                    count2--;
                else
                    return false;
            }
            else {
                throw new Exception("Invalid character" + c);

            }
        }


            if(count1 ==0 && count2==0)
                return true;
            else
                return false;


        }

    public static void main (String[] args){
        try{
            System.out.println(match("()"));
            System.out.println(match("{"));
            System.out.println(match(")"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
