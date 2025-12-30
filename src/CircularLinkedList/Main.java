package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("Zulfa");
        list.addFirst("Jood");
        list.addLast("Elaf");
        list.addLast("Fatima");
        list.removeFirst();
        list.removeLast();
        list.display();



    }
}
