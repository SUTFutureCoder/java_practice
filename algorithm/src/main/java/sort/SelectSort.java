package sort;

import base.Exchange;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 4:28 PM.
 */
public class SelectSort {

    public static int[] selectionSort(int a[]) {
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                Exchange.Exec(a, i, min);
            }
        }
        return a;
    }


}
