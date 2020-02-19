package com.example.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CommonUtil {


    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 去除中括号
     */
    public static String removeBrackets(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        return s;
    }
    /**
     * 去除空格
     */
    public static String removeBlank(String s) {
        s = s.replace(" ", "");
        return s;
    }

    /**
     * 日期后退一天
     * @param dt
     * @return
     */
    public static String getTime(String dt){
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dt));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, +1);
        return sdf.format(c.getTime());//日期后退一天
    }


    /***
     * 获得当前系统时间（字符串格式）
     * @return
     */
    public static String getStringTodayMillisecond(){
        Date todat_date = new Date();
        //将日期格式化
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssSS");
        //转换成字符串格式
        return simpleDateFormat.format(todat_date);
    }


 //   private final Random random ;

//    public RandomUtil() {
//
//        random = new Random();
//    }

    //获取给定字符串给定长度的随机字符
    public String generateRandomChars(String pattern, int length) {

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        return random.ints(0, pattern.length())
                .mapToObj(pattern::charAt)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

}
