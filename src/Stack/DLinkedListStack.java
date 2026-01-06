package Stack;

import DoublyLinkedList.DoublyLinkedList;

public class DLinkedListStack<E> implements Stack<E> {

DoublyLinkedList<E> dList=new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return dList.isEmpty();
    }

    @Override
    public int size() {
        return dList.size();
    }
    @Override
    public void push(E data) {
        dList.addFirst(data);
    }
    @Override
    public E pop() {
        return dList.removeFirst();
    }
    @Override
    public E top() {
        return dList.getFirst();
    }
    @Override
    public void display() {
        dList.display();

    }
}
