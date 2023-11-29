package sde.program.analysis;
import java.util.Stack;
import java.util.EmptyStackException;
public class paranthesismatching_stack_2 {
    public static boolean match (String parens) throws Exception
    {
        Stack<Character> myStack =new Stack<Character>();
        for(char c: parens.toCharArray())
        {
            if(c=='('|| c=='{'||c=='[')
                myStack.push(c);
            else if(c==')'){
               try{
                   char t=myStack.pop();
                   if(t!='(')
                       return false;

               }
               catch(EmptyStackException e){
                   return false;
               }

            }
            else if(c=='}'){
                try{
                    char t=myStack.pop();
                    if(t!='{')
                        return false;

                }
                catch(EmptyStackException e){
                    return false;
                }

            }
            else if(c==']'){
                try{
                    char t=myStack.pop();
                    if(t!='[')
                        return false;

                }
                catch(EmptyStackException e){
                    return false;
                }

            }
            else {
                throw new Exception("Invalid character" + c);
            }

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
            System.out.println(match("({[}])"));
            System.out.println(match("){"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
