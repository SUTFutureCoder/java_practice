package ch1;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/5/3 5:25 PM.
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }
}
