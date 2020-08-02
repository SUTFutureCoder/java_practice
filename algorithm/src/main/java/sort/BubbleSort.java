package sort;

import base.Exchange;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:22 PM.
 */
public class BubbleSort {

    public static int[] bubbleSort(int a[]) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    Exchange.Exec(a, j, j+1);
                }
            }
        }
        return a;
    }

}
