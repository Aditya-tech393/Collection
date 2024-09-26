public class OwnQueue<T> extends LL{

    public void offer(T data) {
        addFirst(data);
    }
    public void display() {
        printList();
        }
    public void remove(){
        deleteLast();
    }
    public void peek(){
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;

        }
        System.out.println(lastNode.data);

    }

    public static void main(String[] args) {
        OwnQueue<Integer> myQueue=new OwnQueue<>();
        myQueue.offer(4);
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.display();
        myQueue.remove();
        myQueue.display();
        myQueue.peek();

    }
}
