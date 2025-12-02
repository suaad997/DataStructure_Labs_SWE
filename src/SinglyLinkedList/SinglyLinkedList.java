package SinglyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

public int size(){
    return size;
}
public boolean isEmpty(){
    return size()==0;

}
public void addFirst(E data){
    Node<E> nNode= new Node(data,head);
    head=nNode;
    if(isEmpty())
        head=tail;

    size++;
}

public E getFirst(){
    if(isEmpty())return null;
    return head.getData();
}

public E removeFirst(){
    if(isEmpty())return null;
    E delete = head.getData();
    head=head.getNext();
    size--;
    if (size()==0)
        head=tail;

return delete;
}


class Node<E>  {
    private E data;
    public Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}

}
