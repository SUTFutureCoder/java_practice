package sort;

import base.Exchange;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:07 PM.
 */
public class InsertSort {

    public static int[] insertSort(int a[]) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 如果a[i]比前面的数字小，则a[i]向前挪
            for (int j = i; j > 0 && (a[j] < a[j - 1]); j--) {
                Exchange.Exec(a, j, j-1);
            }
        }
        return a;
    }

}
