package com.hyper;

/**
 * 参考 https://www.cnblogs.com/xiaomiganfan/p/5390252.html
 *类型 T 必须实现 Comparable 接口，并且这个接口的类型是 T。只有这样，T 的实例之间才能相互比较大小。例如，在实际调用时若使用的具体类是 Dog，那么 Dog 必须 implements Comparable<Dog>
 * @author xingchen.lin
 * @time 2018/10/14 4:19 PM.
 */
public class MaximumTest {

    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        // 假设x是初始最大值
        T max = x;
        if (y.compareTo(max) > 0) {
            // y更大
            max = y;
        }
        if (z.compareTo(max) > 0) {
            // z更大
            max = z;
        }
        return max;
    }

    public static void main(String []args) {
        System.out.println(maximum(3, 4, 5));
        System.out.println(maximum(6.6, 8.8, 7.7));
        System.out.println(maximum("pear", "apple", "orange"));
    }

}
