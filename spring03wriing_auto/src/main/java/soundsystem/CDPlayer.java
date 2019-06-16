package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/8 5:17 PM.
 */
@Component
public class CDPlayer {

    @Autowired(required = false)
    private CompactDisc cd;

    @Autowired
    private Power power;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参数构造函数");
    }

//    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("CDPlayer的有参构造函数");
//    }

//    @Autowired
//    public CDPlayer(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//        System.out.println("CDPlayer的多参数构造函数...");
//    }

//    @Autowired
//    public void setCd(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("调用setCd...");
//    }
//
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//        System.out.println("调用setPower...");
//    }

//    @Autowired
//    public void prepare(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//        System.out.println("调用prepare方法");
//    }

    public void play() {
        power.supply();
        if (cd != null) {
            cd.play();
        }
    }
}
