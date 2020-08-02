package sort;

import org.junit.jupiter.api.Test;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/29 8:19 AM.
 */
public class HeapSortTest {

    @Test
    public void doTest() {
        int a[] = {3, 2, 3, 5, 1, -2, 7, 0, 1};
        for (Integer b : sort.HeapSort.heapSort(a)) {
            System.out.println(b);
        }
    }

}
