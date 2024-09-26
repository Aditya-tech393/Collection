import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list;
    Queue(){
        list = new LinkedList<>();
    }
    public void equeue(int data){
        list.addLast(data);

    }
    public void dequeue(){
        list.removeFirst();

    }
    public Integer peek(){
        return  list.peekFirst();
    }
    public void display(){
        System.out.println(list);
    }
    public Integer poll(){
        return list.removeFirst();

    }

    public static void main(String[] args) {
        Queue myQueue =new Queue();
        myQueue.equeue(1);
        myQueue.equeue(4);
        myQueue.equeue(5);
        myQueue.equeue(9);
        myQueue.equeue(2);
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.poll());

        myQueue.display();


    }
}