package sort;

import base.Exchange;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:51 PM.
 */
public class ShellSort {

    public static int[] shellSort(int[] a) {
        int N = a.length;
        int h = 1;
        // 增量序列
        while (h < N / 3) {
            // h = 1,4,13,40
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                // 进行插入
                for (int j = i; j >= h && a[j - h] > a[j]; j -= h) {
                    Exchange.Exec(a, j, j - h);
                }
            }
            h /= 3;
        }
        return a;
    }

}
