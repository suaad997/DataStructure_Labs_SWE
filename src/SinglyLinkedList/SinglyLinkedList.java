package SinglyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void addFirst(E data) {
        Node<E> nNode = new Node(data, head);
        head = nNode;
        if (isEmpty())
            tail = head;
        size++;
    }

    public E getFirst() {
        if (isEmpty()) return null;
        return head.getData();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E delete = head.getData();
        head = head.getNext();
        size--;
        if (size() == 0)
            tail = head;
        return delete;
    }

    public void addLast(E data) {
        Node<E> nNode = new Node(data, null);
        if (isEmpty()) {
            head = nNode;
        } else {
            tail.setNext(nNode);
        }
        tail = nNode;
        size++;
    }

    public E getLast() {
        if (isEmpty()) return null;
        return tail.getData();
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E delete = tail.getData();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<E> temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
        }
        size--;
        return delete;
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "----->");
            temp = temp.getNext();

        }
        System.out.println("null");


    }
public void addAtPosition(E data,int position) {
       if(position<=0 || position>size+1)
           throw new IllegalArgumentException("Invaild position");

       if (position==1){
           addFirst(data);
       return;}
       else {
           Node<E> newNode=new Node<E>(data,null);
           Node<E> temp=head;
           int count=1;
           while (count<position-1){
               temp=temp.getNext();
               count++;
           }
           newNode.setNext(temp.getNext());
           temp.setNext(newNode);
           if(newNode.getNext()==null){
               tail=newNode;
           }
           size++;
       }



    }




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


