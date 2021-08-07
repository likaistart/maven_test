package date2021.other.Proxy.method2;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: maven_test
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method2
 * @author: LiKai
 * @date: 2021-08-04 08:34
 **/
public class test1 {
    public static void main(String[] args) {
//        Integer A = sss();
//        String str = "1,3,4,5,12,7,8,9";
////        char c = str.charAt(str.length() - 1);
////        System.out.println(c);
//        System.out.println(String.format("%s,%d",str,1));
//        Double completeRate = getPercentValue(1, 3);
//        System.out.println(completeRate);

        System.out.println(getDay(new Date(),new Date()));;
    }

    public static Double getPercentValue(int minValue, int maxValue) {
        Double minValue1 = (double) minValue;
        Double result = minValue1 / maxValue;
        BigDecimal two = new BigDecimal(result*100);
        return two.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /*
    判读时间差距，两个时间相差多少天，时，分，秒
     */
    public static Long getDay(Date date,Date otherDate) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long days = null;
        try {
            Date currentTime = dateFormat.parse(dateFormat.format(otherDate));//现在系统当前时间
            long diff = currentTime.getTime() - date.getTime();
            days = diff / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}