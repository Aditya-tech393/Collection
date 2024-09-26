import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> list=new LinkedList<>();

    public void push(int data){
        list.addFirst(data);
    }
    public Integer pop(){
        if(list.isEmpty()){
            System.out.println("Stack is emply");
            return null;
        }
        return list.removeFirst();
    }
    public Integer peek(){
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.peekFirst();
    }
    public void display(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        Stack myStack =new Stack();

        myStack.push(9);
        myStack.push(3);
        myStack.push(6);
        myStack.push(8);
        myStack.push(1);
        System.out.println(myStack.peek());
        myStack.display();
        System.out.println(myStack.pop());
    }
}
