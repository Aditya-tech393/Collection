public class LL<T> {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    // Adding element at first position
    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding element at last position
    public void addLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void insert(int index,T data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Getting size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL<String> list = new LL<>();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        list.insert(2,"hi");
        list.printList();
    }
}