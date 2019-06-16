package hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/7 5:31 PM.
 */
public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("applicationSpring");

        // 初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 从容器中获取MessageService对象
//        MessageService service = context.getBean(MessageService.class);

//        printer.setService(service);
        printer.printMessage();
    }

}
