package SOLID.DIP.Sorting;

import java.util.Random;

public class SortingTest {
    public static final int SIZE = 30;

    public static void main(String arg[]){
        
        Integer[] arr = new Integer[SIZE];
        Random r = new Random(100);
        for(int i=0;i<SIZE;i++){
            arr[i]=r.nextInt(50);
        }
        SortingOperator.display(arr);
        SortingOperator.sort(new HeapSort(), arr);
        SortingOperator.sort(new InsertionSort(),arr);
        SortingOperator.display(arr);
    }

}
