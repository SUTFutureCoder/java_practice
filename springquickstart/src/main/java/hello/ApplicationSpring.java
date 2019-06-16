package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/7 5:31 PM.
 */
@ComponentScan
public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("applicationSpring");

        // 初始化spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 从容器中获取MessageService对象
//        MessageService service = context.getBean(MessageService.class);

//        printer.setService(service);
        printer.printMessage();
    }

}
