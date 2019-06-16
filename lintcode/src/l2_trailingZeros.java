import java.util.HashMap;
import java.util.Map;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/5/4 4:16 PM.
 */
public class l2_trailingZeros {

    private long maxTail = 1L;

    private static HashMap<Long, Integer> tailMap = new HashMap<>();

    private static HashMap<Long,> history = new HashMap<>();

    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        if (tailMap.containsKey(n)) {
            return tailMap.get(n);
        }

        for (Long i = this.maxTail; i <= n; i++) {
            if (!history.containsKey(i - 1)) {
                history.put(i - 1, 1L);
            }
            history.put(i, (history.get(i - 1) * i));
            System.out.println(history);
            // 计算tail
            Integer zeroNum = 1;
            while (history.get(i) != 0 && history.get(i) % (Math.pow(10, zeroNum)) == 0) {
                zeroNum++;
            }
            tailMap.put(i, zeroNum - 1);
        }
        this.maxTail = n;
        return tailMap.get(n);
    }

    public static void main(String[] args) {
        l2_trailingZeros test = new l2_trailingZeros();
        System.out.println(test.trailingZeros(105L));
    }

}
