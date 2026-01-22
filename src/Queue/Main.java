package Queue;

public class Main {
    public static void main(String[] args) {
        //LinkedQueue<Integer> lqueue=new LinkedQueue<Integer>();
        ArrayQueue<Integer> aqueue=new ArrayQueue<Integer>();
        aqueue.enqueue(1);
        aqueue.enqueue(2);
        aqueue.enqueue(3);
        aqueue.enqueue(4);
//        aqueue.display();
        System.out.println("the first is : "+aqueue.front());
        while (!aqueue.isEmpty()){
            System.out.println("element removed "+aqueue.dequeue());
        }



    }
}
