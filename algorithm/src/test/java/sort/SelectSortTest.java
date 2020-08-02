package sort;

import org.junit.jupiter.api.Test;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 4:43 PM.
 */
public class SelectSortTest {

    @Test
    public void doTest() {
        int a[] = {3, 2, 3, 5, 1, -2, 7, 0, 1};
        for (Integer b : sort.SelectSort.selectionSort(a)) {
            System.out.println(b);
        }
    }

}
