
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

}
class Queue{
    Node front,rear;
    public Queue(){
        this.front=this.rear=null;

    }
    void enqueue(int value){
        Node temp =new Node(value);
        if(this.rear==null)
        {
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
    }
    void dequeue(){
        if(this.front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("removing"+front.data+"from this queue");
        this.front=this.front.next;
        if(this.front==null){
            this.rear=null;
        }
    }
    void printQueue(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class QueueLinkedList {
    public static void main (String[]args){
        Queue myQueue=new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();


    }
}
