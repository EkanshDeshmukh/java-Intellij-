package LinkedList_1;

public class LinkedList_Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addAt(60,0);
        ll.removeFirst();
        ll.removeLast();
        ll.removeAt(2);
        ll.display();
    }
}
