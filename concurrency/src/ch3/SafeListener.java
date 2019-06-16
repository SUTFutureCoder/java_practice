package ch3;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EventListener;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/5/4 3:40 PM.
 */
public class SafeListener {

    private final EventListener listener;

    private SafeListener() {
        listener = new EventListener() {
            public void onEvent(Event e) {
                // dosth e
            }
        };
    }

    public static SafeListener newInstance(EventSource source) {
        SafeListener safe = new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }

    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<Connection>() {
        @Override
        public Connection initialValue()  {
            return DriverManager.getConnection("url");
        }
    };

    public static Connection getConnection() {
        return connectionThreadLocal.get();
    }

}
