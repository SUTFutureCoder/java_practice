package sort;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 6:41 PM.
 */
public class CountSort {

    public static int[] countSort(int[] a) {
        int max = a[0];

        for (int v : a) {
            if (v > max) {
                max = v;
            }
        }

        int[] count = new int[max + 1];

        for (int v : a) {
            count[v]++;
        }

        int indexArray = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[indexArray++] = i;
                count[i]--;
            }
        }
        return a;
    }

}
