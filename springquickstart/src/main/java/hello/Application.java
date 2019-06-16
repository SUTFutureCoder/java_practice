package hello;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/6/7 5:31 PM.
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("application");

        MessagePrinter printer = new MessagePrinter();

        MessageService service = new MessageService();

        printer.setService(service);

        printer.printMessage();
    }

}
