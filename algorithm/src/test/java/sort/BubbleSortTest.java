package sort;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:23 PM.
 */
public class BubbleSortTest {

    @Test
    public void doTest() {
        int a[] = {3, 2, 3, 5, 1, -2, 7, 0, 1};
        for (Integer b : sort.BubbleSort.bubbleSort(a)) {
            System.out.println(b);
        }
    }

}
