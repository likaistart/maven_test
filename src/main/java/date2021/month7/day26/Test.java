package date2021.month7.day26;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month7.day26
 * @author: LiKai
 * @date: 2021-07-26 20:36
 **/
public class Test {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(11);
//        list2.add(22);
//
//        Set<Integer> list3 = new HashSet<>();
//        list3.addAll(list1);
//        list3.addAll(list2);
//        for (Integer i : list3) {
//            System.out.println(i);
//        }

//        Map<String,String> hashMap=new HashMap<>();
//        hashMap.put("1","2");
//
//
//        String s = transMapToString(hashMap);
//        System.out.println(s);
//        Map<String,Object> map = new HashMap<>();
//        map.put("age", 24);
//        map.put("name", "cool_summer_moon");
//        String jsonString = JSON.toJSONString(map);
//        System.out.println("json字符串是："+jsonString);

        List list = new ArrayList<>();
        list.add("laoyi");
        list.add("laoer");
        list.add("laosan");

        System.out.println("List数组：" + list);
        if (list == null && list.size() == 0) {
            System.out.println("list中的内容为空！");
        } else {

            String[] strArrStrings = new String[list.size()];
            String resultString = "";

            for (int i = 0; i <= list.size() - 1; i++) {
                strArrStrings[i] = (String) list.get(i);
            }

            for (int j = 0; j <= strArrStrings.length - 1; j++) {
                if (j < strArrStrings.length - 1) {
                    resultString += strArrStrings[j] + ",";
                } else {
                    resultString += strArrStrings[j];
                }
            }
            System.out.println("最后拼接的字符串：" + resultString);
        }
    }
}






