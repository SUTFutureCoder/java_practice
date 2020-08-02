package sort;

import org.junit.jupiter.api.Test;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/10/28 5:53 PM.
 */
public class ShellSortTest {

    @Test
    public void doTest() {
        int a[] = {3, 2, 3, 5, 1, -2, 7, 0, 1};
        for (Integer b : sort.ShellSort.shellSort(a)) {
            System.out.println(b);
        }
    }

}
