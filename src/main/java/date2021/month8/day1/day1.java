package date2021.month8.day1;

import java.util.*;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month8
 * @author: LiKai
 * @date: 2021-08-01 10:41
 **/
public class day1 {
    public static void main(String[] args) {
//        String str="19678,19679,19680,19681,19682,19683,19684,19685,19686,19687,19688,19689,19690,19691,19692,19693,19694,19695,19696";
//
//        String str1="19678,19679,19680|19591,19592";
//        //Set<Integer> set=new HashSet<>();
//        List<Integer> set=new ArrayList<>();
//        set.add(19682);
//        set.add(19591);
//        set.add(19572);
//        set.add(19573);
//        set.add(19576);
//        set.add(19681);
//        set.add(19682);
//        set.add(19587);
//        set.add(19588);
//        set.add(19589);
//        set.add(19574);
//        set.add(19575);
//        System.out.println(set.size());
//        System.out.println(set.stream().sorted());
//        List<String> elementData=new ArrayList<String>();
//        elementData.add("1");
//        elementData.add("2");
//        elementData.add("3");
//
//        List<String> newCapacity=new ArrayList<String>();
//        String s = parsePercent(16);
//        System.out.println(s);

        double s1 = 0.98762f;
        String format = String.format("%.2f%%", s1 * 100);
        System.out.println(format);


    }

    private static String parsePercent(Object obj){
        Double  d=Double.parseDouble(obj.toString());

        java.text.NumberFormat percentFormat =java.text.NumberFormat.getPercentInstance();

        percentFormat.setMaximumFractionDigits(2); //最大小数位数

        percentFormat.setMaximumIntegerDigits(2);//最大整数位数

        percentFormat.setMinimumFractionDigits(2); //最小小数位数

        percentFormat.setMinimumIntegerDigits(1);//最小整数位数

        return percentFormat.format(d);//自动转换成百分比显示

    }

}