package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();

        list.addLast(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addAtPosition(80,4);
        list.removeLast();
        list.removeFirst();
        list.display();

    }
}
