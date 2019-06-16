package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/8 5:38 PM.
 */
@Component
public class Power {

    public Power() {
        super();
    }

    public void supply() {
        System.out.println("电源供电中...");
    }
}
