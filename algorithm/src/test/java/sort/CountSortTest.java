package sort;

import org.junit.jupiter.api.Test;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 6:43 PM.
 */
public class CountSortTest {

    @Test
    public void doTest() {
        int a[] = {3, 2, 3, 5, 1, 7, 0, 1};
        for (Integer b : sort.CountSort.countSort(a)) {
            System.out.println(b);
        }
    }

}
