package date2021.oldpackage;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {
    public static final BigDecimal COMMISSION_RATE = BigDecimal.valueOf(0.95);
    public static final String TIME_YMD_HMS = "yyyy-MM-dd hh:mm:ss";

//    public static Date stringToDate(String time) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = format.parse(time);
//        return date;
//    }
//
//    public static void queryDays(String datestr) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String beginStr = datestr + "-01";
//        Date beginTo;
//        Date endTo;
//        try {
//            beginTo = dateFormat.parse(beginStr);
//
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(dateFormat.parse(beginStr));
//            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//            endTo = calendar.getTime();
//            System.out.println(beginTo);
//            System.out.println(endTo);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }

    public static String getLastDayOfMonth(String dateStr) {
        String[] split = dateStr.split("-");
        int year = Integer.valueOf(split[0]);
        int month = Integer.valueOf(split[1]);
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR, year);
        //设置月份
        cal.set(Calendar.MONTH, month - 1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String lastDayOfMonth = sdf.format(cal.getTime());

        return lastDayOfMonth;
    }

    public static String getBeginTime(String dateStr) {
        String[] split = dateStr.split("-");
        int year = Integer.valueOf(split[0]);
        int month = Integer.valueOf(split[1]);
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate localDate = yearMonth.atDay(1);
        LocalDateTime startOfDay = localDate.atStartOfDay();
        ZonedDateTime zonedDateTime = startOfDay.atZone(ZoneId.of("Asia/Shanghai"));
        Date from = Date.from(zonedDateTime.toInstant());
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String lastDayOfMonth = sdf.format(from);
        return lastDayOfMonth;
    }

    public static Date strToDateTime(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar cal1 = Calendar.getInstance();
        Date timeDate = new Date();
        try {
            timeDate = sdf.parse(dateStr);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeDate;
    }


    public static void main(String[] args) throws ParseException {
        String start="2021-02";
        String end="2021-02";
        Date startDate1 = strToDateTime(start+" 00:00:00", "yyyy-MM-dd HH:mm:ss");
        Date endDate1 = strToDateTime(start+" 23:59:59", "yyyy-MM-dd HH:mm:ss");
        Date endDateOver =strToDateTime(end+" 23:59:59", "yyyy-MM-dd HH:mm:ss");
        //"2012-01-01 00:00:00"
//        queryDays("2021-01");
//        String str = String.format("%s%s", "2012-01", "-01 00:00:00");
//        System.out.println(stringToDate(str));
//        BigDecimal bigDecimal = new BigDecimal(110);
//        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
//        System.out.println(subtract);

//        double v = COMMISSION_RATE.doubleValue();
//        System.out.println(v);
//        System.out.println(getBeginTime( "2021-03"));
//        System.out.println(getLastDayOfMonth( "2021-03"));
//        BigDecimal bigDecimal = new BigDecimal(1.111);
//        System.out.println(String.valueOf(bigDecimal.doubleValue()));
//        Date currentTime=new Date();
//        String s = dateToString(currentTime, TIME_YMD_HMS);
//        System.out.println(s);

//        String str="completePercentageAssess";
//        String s = str.toUpperCase();
//        System.out.println(s);
//        Integer appointTotal=9;
//        Double signOntimeTotal=19.0;
//        Double curAppointRate = (appointTotal / signOntimeTotal);
//        System.out.println(curAppointRate);
//        String s = dateToString(new Date(), "yyyy-MM-dd");
//        System.out.println(s);

//        Vector actor=new Vector();
//        actor.add("ccc");
//        List<String> list=new LinkedList<>();
//        list.add("123");
//        List<String> list1=new ArrayList<>(actor);
//        List<String> list2=new ArrayList<>(list1);
//        list1.add("abc");
//
//        for(String str:list2){
//            System.out.println(str);
//        }


        List<Student> students = new ArrayList<>();

//        students.add(new Student("abc", 12.124));
//        students.add(new Student("bcd", 20.214));
//        students.add(new Student("cde", 17.321));
//        students.add(new Student("def", 25.145));
//        students.add(new Student("efg", 15.145));

        students.sort((y, x) -> Double.compare(x.getAge(), y.getAge()));
        //这方法需要jdk1.8以上

        for (Student stu : students) {
            System.out.println(stu);

        }
    }


    public static String dateToString(Date date, String timePattern) {
        SimpleDateFormat format = new SimpleDateFormat(timePattern);
        String time = format.format(date);
        return time;
    }


    /**
     * 获取某月的开始时间
     *
     * @param dateStr
     * @return
     */
//    public static String getBeginTime(String dateStr) {
//        String[] split = dateStr.split("-");
//        int year = Integer.valueOf(split[0]);
//        int month = Integer.valueOf(split[1]);
//        YearMonth yearMonth = YearMonth.of(year, month);
//        LocalDate localDate = yearMonth.atDay(1);
//        LocalDateTime startOfDay = localDate.atStartOfDay();
//        ZonedDateTime zonedDateTime = startOfDay.atZone(ZoneId.of("Asia/Shanghai"));
//        Date from = Date.from(zonedDateTime.toInstant());
//        //格式化日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
//        String lastDayOfMonth = sdf.format(from);
//        return lastDayOfMonth;
//    }

    /**
     * 获取某月的最后一天
     */
//    public static String getLastDayOfMonth(String dateStr) {
//        String[] split = dateStr.split("-");
//        int year = Integer.valueOf(split[0]);
//        int month = Integer.valueOf(split[1]);
//        Calendar cal = Calendar.getInstance();
//        //设置年份
//        cal.set(Calendar.YEAR, year);
//        //设置月份
//        cal.set(Calendar.MONTH, month - 1);
//        //获取某月最大天数
//        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//        //设置日历中月份的最大天数
//        cal.set(Calendar.DAY_OF_MONTH, lastDay);
//        //格式化日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
//        String lastDayOfMonth = sdf.format(cal.getTime());
//
//        return lastDayOfMonth;
//    }



}
