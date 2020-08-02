package base;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 4:28 PM.
 */
public class Exchange {

    public static void Exec(int a[], int i, int j) {
        if (a[i] != a[j]) {
            a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
        }
    }

}
