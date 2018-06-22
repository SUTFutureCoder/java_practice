package com.javapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {

    public static void main(String []args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date:" + ft.format(date));

        System.out.printf("Y-m-d格式: %tF%n", date);
        System.out.printf("hh:mm:ss格式 24h: %tT%n", date);
        System.out.printf("全部日期和时间信息: %tc%n", date);
        System.out.printf("hh:mm格式: %tR%n", date);

        // 重复提供日期
        System.out.printf("%1$s %2$tB %2$td %2$tY\n", "Due date:", date);
        System.out.printf("%s %tB %<te %<tY\n", "Due date:", date);

        // 解析字符串为时间
        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-mm-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parsed as ");
        Date t;
        try {
            t = ft2.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft2);
        }

        // 测量时间
        try {
            long start = System.currentTimeMillis();
            System.out.println(start);
            Thread.sleep(3000);
            long end = System.currentTimeMillis();
            System.out.println(end);
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
