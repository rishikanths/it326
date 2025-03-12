package SOLID.DIP.Sorting;

public class HeapSort extends Sorting{

    @Override
    public boolean sort(Integer[] list) {
        int size = list.length;

        // Build heap
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(list, size, i);

        for (int i=size-1; i>=0; i--) {
            int x = list[0];
            list[0] = list[i];
            list[i] = x;
            heapify(list, i, 0);
        }
        return true;
    }

    private void heapify(Integer arrA[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx  = 2*i + 1; // left = 2*i + 1
        int rightChildIdx  = 2*i + 2; // right = 2*i + 2

        if (leftChildIdx  < heapSize && arrA[leftChildIdx ] > arrA[largest])
            largest = leftChildIdx ;

        if (rightChildIdx  < heapSize && arrA[rightChildIdx ] > arrA[largest])
            largest = rightChildIdx ;

        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            heapify(arrA, heapSize, largest);
        }
    }
}