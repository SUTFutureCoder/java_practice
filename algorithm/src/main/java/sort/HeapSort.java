package sort;

import base.Exchange;

import java.math.BigInteger;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/29 8:13 AM.
 */
public class HeapSort {

    public static void sink(int[] a, int k, int N) {
        while (2 * k + 1 <= N) {
            int j = 2 * k + 1;
            if (j < N - 1 && a[j+1] > a[j]) {
                j++;
            }
            if (a[j] < a[k]) {
                break;
            }

            Exchange.Exec(a, k, j);
            k = j;
        }
    }

    public static int[] heapSort(int[] a) {
        int N = a.length;

        // 构造一个堆有序
        for (int i = N/2; i >= 0; i--) {
            sink(a, i, N - 1);
        }
        N = N - 1;

        while (N > 0) {
            Exchange.Exec(a, 0, N--);
            sink(a, 0, N);
        }
        return a;
    }

}
