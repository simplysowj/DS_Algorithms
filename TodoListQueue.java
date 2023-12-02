import java.util.LinkedList;

class MyQueue<T>{
    private LinkedList<T> list=new LinkedList<T>();
    public void add(T element){
        this.list.add(element);
    }
    public T remove(){
        return this.list.remove();
    }
    public int size(){
        return this.list.size();
    }




}
public class TodoListQueue {
    public static void makeTodoList(MyQueue<String> todoList) {
        todoList.add("Buy groceries");
        todoList.add("Buy paper");
    }
    public static void doAllTasks(MyQueue<String> todoList){
        while(todoList.size()!=0){
            System.out.println(todoList.remove());
        }
    }
    public static void main (String[]args) {
        MyQueue<String> todolist = new MyQueue<String>();
        makeTodoList(todolist);
        doAllTasks(todolist);

    }
    }

