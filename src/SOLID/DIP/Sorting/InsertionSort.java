package SOLID.DIP.Sorting;

public class InsertionSort extends Sorting {

    public boolean sort(Integer list[]) {
        int size = list.length;
        for (int step = 1; step < size; step++) {
            int key = list[step];
            int j = step - 1;

            while (j >= 0 && key < list[j]) {
                list[j + 1] = list[j];
                --j;
            }
            list[j + 1] = key;
        }
        return true;
    }
}
