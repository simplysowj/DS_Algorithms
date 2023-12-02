
    class Queue1{
        private static int front,rear,size;
        private static int myQueue[];

        Queue1(int customSize){
            front=rear=0;
            size=customSize;
            myQueue=new int[size];
        }

        static void enqueue(int data){
            if(size==rear){
                System.out.println("full");
                return;
            }
            else{
                myQueue[rear]=data;
                rear++;
            }
        }
        static int dequeue(){
            int temp=0;
            if(front==rear){
                System.out.println("Queue is empty");

            }
            else{
                temp=myQueue[front];
                for (int i=0;i<rear-1;i++){
                    myQueue[i]=myQueue[i+1];
                }
                if(rear<size) {
                    myQueue[rear] = 0;
                }
                rear--;
            }
            return temp;
        }
        static void printQueue(){
            if(front==rear){
                System.out.println("Queue is empty");

            }
            else{
                for(int i=front;i<rear;i++){
                    System.out.print(myQueue[i]+" ");
                }
                System.out.println();
            }

        }

    }


    public class QueueWithArray {

    public static void main (String[]args) {
        Queue1 newQueue = new Queue1(5);
        newQueue.enqueue(10);
        newQueue.enqueue(20);
        newQueue.enqueue(30);
        newQueue.printQueue();
        newQueue.dequeue();
        newQueue.printQueue();
    }


    }