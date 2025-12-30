package Stack;

public class Main {
    public static void main(String[] args) {
        SLinkedListStack<String> lstack= new SLinkedListStack<String>();
        lstack.push("ali");
        lstack.push("saleh");
        lstack.push("ahmed");
        lstack.push("mohammed");
        System.out.println("top is "+lstack.top());

        while (!lstack.isEmpty()){
            System.out.println(lstack.pop());
        }
//        lstack.pop();
//        lstack.pop();
       // lstack.display();
    }
}
