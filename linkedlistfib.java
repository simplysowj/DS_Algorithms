package sde.program.analysis;

class StackLinkedList{
    class Node{
        int data;
        Node next;
    }
    Node top;
    StackLinkedList(){
        this.top=null;

    }
    void push(int data){
        Node temp=new Node();
        if(temp==null){
            System.out.println("Overflow");
            return;
        }
        temp.data= data;
        temp.next= top;
        top=temp;

    }
    int pop(){
        if(top==null){
            System.out.println("underflow");
            return 0;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    void display(){
        if(top==null){
            System.out.println("underflow");

        }
        else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;

            }
            System.out.println();
        }
    }
}
public class linkedlistfib {
    public static void main(String[]args) {
        StackLinkedList myStack = new StackLinkedList();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.display();
        System.out.println(myStack.pop()+"Popped");
        System.out.println(myStack.pop()+"Popped");
        myStack.display();




    }
}
