package sde.program.analysis;

import java.util.Stack;

public class ParenthesisMatchingStack {

    public static boolean match (String parens) throws Exception
    {
        Stack<Character> myStack =new Stack<Character>();
        for(char c: parens.toCharArray())
        {
            if(c=='(')
                myStack.push('(');
            else if(c==')'){
                if(!myStack.isEmpty()){
                    myStack.pop();
                }
                else
                    return false;
            }
            else
                throw new Exception("Invalid character" + c);
        }

        if(myStack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main (String[] args){
        try{
            System.out.println(match("()"));
            //System.out.println(match("{"));
            System.out.println(match(")"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
