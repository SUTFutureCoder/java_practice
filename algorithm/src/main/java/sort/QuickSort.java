package main.java.sort;

import org.junit.jupiter.api.Test;

/**
 * @author xingchen.lin
 * @desc
 * @time 2020/8/2 10:13 上午.
 */
public class QuickSort {

    @Test
    public void testQuickSort() {
        int[] a = {2, 3, 1, 4, 6, -1, 2, 4, 7, 0};
        quickSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private void quickSort(int[] a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = partition(a, begin, end);
        quickSort(a, begin, pivot - 1);
        quickSort(a, pivot + 1, end);
    }

    private int partition(int[] a, int begin, int end) {
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i] < a[end]) {
                int temp = a[i];
                a[i] = a[counter];
                a[counter] = temp;
                counter++;
            }
        }
        int temp = a[end];
        a[end] = a[counter];
        a[counter] = temp;
        return counter;
    }

}
