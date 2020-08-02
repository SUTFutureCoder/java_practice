package sort;

import base.Exchange;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:37 PM.
 */
public class CombSort {

    public static int[] combSort(int[] a) {
        int N = a.length;
        int step = N;
        int k;
        // 第一部分
        while ((step *= 0.8) > 1) {
            for (int i = N - 1; i >= step; i--) {
                k = i - step;
                if (a[k] > a[i]) {
                    Exchange.Exec(a, k, i);
                }
            }
        }

        return BubbleSort.bubbleSort(a);
    }

}
