package SOLID.DIP.Sorting;

public class BubbleSort extends Sorting {

    @Override
    public boolean sort(Integer[] list) {
        int len = list.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (list[j + 1] < list[j]) {
                    int swap = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = swap;

                }
            }
        }
        return true;
    }

}
