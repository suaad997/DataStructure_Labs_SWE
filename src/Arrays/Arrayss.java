package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner =new Scanner(System.in);


    public void Traversal(int []a){
        for (int i=0; i<a.length;i++)
            System.out.println("Index["+i+"] = "+a[i]);

    }
    public void Traversal2(int []a){
        for (int e:a)
            System.out.println(e);

    }

    public void R_Traversal(int []a){
        for (int i=a.length-1; i>=0;i--)
            System.out.println("Index["+i+"] = "+a[i]);

    }


    public void input(int[]a){
        System.out.println("enter  "+a.length+ " numbers:");
        for(int i=0; i<a.length;i++)
            a[i]=scanner.nextInt();
    }
    public  void update(int []a, int index, int nvalue){
        a[index]=nvalue;

    }
    public  void delete(int []a, int index){
        a[index]=0;

    }





}
