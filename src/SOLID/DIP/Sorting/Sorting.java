package SOLID.DIP.Sorting;

/**
 * Sorting is an abstraction. Why? No mattter want sorting algorithm you use, they MUST support
 * sort of numbers.
 */
public abstract class Sorting {
   
    public abstract boolean sort(Integer[] list);
}
