package sort;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 6:49 PM.
 */
public class MergeSort {

    public static int[] aux;

    public static int[] merge(int[] a, int lo, int middle, int hi) {
        int i = lo;

        int j = middle + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int z = lo; z <= hi; z++) {
            if (i > middle) {
                a[z] = aux[j++];
            } else if (j > hi) {
                a[z] = aux[i++];
            } else if (aux[i] > aux[j]) {
                a[z] = aux[j++];
            } else {
                a[z] = aux[i++];
            }
        }
        return a;
    }

    public static int[] mergeSort(int[] a) {
        aux = new int[a.length];
        return mergeSort(a, 0, a.length - 1);
    }

    public static int[] mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return new int[]{};
        }

        int middle = (lo + hi) / 2;

        mergeSort(a, lo, middle);
        mergeSort(a, middle + 1, hi);

        return merge(a, lo, middle, hi);
    }



}
