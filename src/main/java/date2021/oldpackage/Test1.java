package date2021.oldpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: Test
 * @description:
 * @packagename: com.lk.date2021
 * @author: LiKai
 * @date: 2021-07-16 23:17
 **/
public class Test1 {
    public static void main(String[] args) {
//        final List<String> l = new LinkedList<>();
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        l.add("4");
//        l.add("5");
//        l.add("6");
//
//        for(String s:l){
//            System.out.println(s);
//        }
        System.out.println(setTimeEnd(new Date()));
    }


    public static Date getLastMonthEnd() {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        int lastMonthMaxDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), lastMonthMaxDay, 23, 59, 59);
        return c.getTime();
    }

    public static Date getLastMonthBegin() {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        int lastMonthMaxDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), lastMonthMaxDay, 23, 59, 59);
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-01  00:00:00");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-01  23:59:59");
        String format = sdf2.format(c.getTime());
        Date lastMonthEnd = null;
        try {
            lastMonthEnd = sdf2.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return lastMonthEnd;
    }

    public static Date setTimeEnd(Date date)
    {
        if (date == null)
            return null;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        return c.getTime();
    }
}