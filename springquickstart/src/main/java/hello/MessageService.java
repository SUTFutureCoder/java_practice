package hello;


import org.springframework.stereotype.Component;

/**
 * 打印输出
 *
 * @author xingchen.lin
 * @desc
 * @time 2019/6/7 5:27 PM.
 */
@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService..");
    }

    /**
     * 执行打印功能
     *
     * @return
     */
    public String getMessage() {
        return "Hello World!";
    }

}
