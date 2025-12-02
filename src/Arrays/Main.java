package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss  arr= new Arrayss();
        int []numbers={10,2,9,4,5,6,7,8,7,1};
        Arrays.sort(numbers);
        arr.Traversal(numbers);
        //int result= arr.LinearSearch(numbers,2);
        int result= arr.binarySearch(numbers,10,0,numbers.length-1);
        if(result!=-1)
        System.out.println( "Value found at index:"+result);
        else
        System.out.println( "Value not found");






        //arr.ShiftLeft_Delete(numbers,0);
      //  numbers[3]=8;
        //arr.update(numbers,3,8);
        //arr.delete(numbers,7);

        //int []numbers2=new int[5];
        //arr.input(numbers2);
        // arr.R_Traversal(numbers);
        //arr.Traversal(numbers);





        //System.out.println(Arrays.toString(numbers));



    }
}
