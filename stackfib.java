package sde.program.analysis;

class Stack{
    static final int MAX=100;
    int top;
    int a[]= new int[MAX];
    Stack(){
        top=-1;
    }
    boolean isEmpty(){
        return(top<0);

    }
    boolean push(int data){
        if(top>=MAX-1){
            System.out.println("Overflow");
            return false;
        }
        else{
            a[++top]=data;
            System.out.println("data inserted");
            return true;
        }

    }
    int pop(){
        if(isEmpty()){
            System.out.println("underflow");
            return 0;
        }
        else{
            int temp=a[top--];
            return temp;

        }
    }
void printStack(){
        for(int i=top;i>-1;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class stackfib {
    public static void main(String[]args){
        Stack myStack=new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.printStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.printStack();


    }
}
