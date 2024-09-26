
public class OwnStack<T> extends LL{

    public void push(T data) {
        addFirst(data);
    }
    public void display() {
        printList();
    }
    public void pop() {
        deleteFirst();
    }
    public void peek(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        OwnStack<Integer> myStack=new OwnStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.display();
        myStack.pop();
        myStack.display();

    }
}
