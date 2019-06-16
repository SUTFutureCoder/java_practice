package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/8 5:16 PM.
 */
//@Component
public class CompactDisc {

    public CompactDisc() {
        super();
        System.out.println("Compact Disc无参构造函数");
    }

    public void play() {
        System.out.println("正在播放音乐...");
    }
}
