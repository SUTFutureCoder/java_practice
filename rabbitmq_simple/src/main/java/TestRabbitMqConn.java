import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Date;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/8/2 12:27 AM.
 */
public class TestRabbitMqConn {

    public static Connection GetRabbitConnection() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        Connection conn = null;
        try {
            conn = factory.newConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Publisher(); // 推送消息

        Consumer(); // 消费消息
    }

    public static void Publisher() {
        // 创建一个连接
        Connection conn = GetRabbitConnection();
        if (conn != null) {
            try {
                // 创建通道
                Channel channel = conn.createChannel();
                // 声明队列【参数说明：参数一：队列名称，参数二：是否持久化，参数三：是否独占模式；参数四：消费者断开时是否删除队列；参数无消息其他参数】
                channel.queueDeclare("test2", false, false, false, null);
                String content = String.format("当前时间： %s", System.currentTimeMillis());
                // 发送内容【参数说明：参数一：交换机名称；参数二：队列名称，参数三：消息其他属性，参数四：消息主体】
                channel.basicPublish("", "test2", null, content.getBytes("UTF-8"));
                System.out.println("已发送消息：" + content);
                // 关闭连接
                channel.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void Consumer() {
        // 创建一个连接
        Connection conn = GetRabbitConnection();
        if (conn != null) {
            try {
                //创建通道
                final Channel channel = conn.createChannel();
                // 声明队列【参数说明：同上】
                channel.queueDeclare("test2", false, false, false, null);
System.out.println(channel.toString());
                // 创建订阅器，并接受消息
                channel.basicConsume("test2", false, "", new DefaultConsumer(channel) {
                    @Override
                    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                        String routingKey = envelope.getRoutingKey(); // 队列名称
                        String contentType = properties.getContentType(); // 内容类型
                        System.out.println(contentType);
                        String content = new String(body, "utf-8"); // 消息正文
                        System.out.println("消息正文:" + content);
                        channel.basicAck(envelope.getDeliveryTag(), false);

                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
