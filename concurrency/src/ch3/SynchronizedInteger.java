package ch3;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/5/3 11:58 PM.
 */
@ThreadSafe
public class SynchronizedInteger {

    @GuardedBy("this") private int value;
    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

}
