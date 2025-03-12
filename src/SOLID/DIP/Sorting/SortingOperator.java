package SOLID.DIP.Sorting;

public class SortingOperator {
    
    /*
     * This function DOESNT follow DIP. Why? you are depending on a concrete class
     * BubbleSort. You can only pass BubbleSort object into this function.
     */
    public static void sort(BubbleSort s,Integer array[]){
        s.sort(array);
    }
    /*
     * This function follows DIP. Why? you are depending on the abstraction Sorting.
     * You can pass an object of type sorting into this function.
     */
    public static void sort(Sorting s,Integer array[]){
        s.sort(array);
    }
    public static void display(Integer[] arr){
        for (Integer arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        System.out.println();
    }
}
