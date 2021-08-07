package date2021.month7.day21;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month7.day21
 * @author: LiKai
 * @date: 2021-07-21 16:04
 **/
public class jsonObjectTest1 {
    public static void main(String[] args) {
//        // Json数组形式的字符串转为Map数组
//
////        String strArr = "{\" 1 \": \" 2 \"},{\" 3 \": \" 4 \"}";
        String strArr = "[{\" 1 \": \" 2 \"},{\" 3 \": \" 4 \"}]";
        //第一种方式
        List<Map<String, String>> listObjectFir = (List<Map<String, String>>) JSONArray.parse(strArr);
        System.out.println("利用JSONArray中的parse方法来解析json数组字符串");
        for (Map<String, String> mapList : listObjectFir) {
            for (Map.Entry entry : mapList.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        }
//        //第二种方式
//        List<Map<String, String>> listObjectSec = JSONArray.parseObject(strArr, List.class);
//        System.out.println("利用JSONArray中的parseObject方法并指定返回类型来解析json数组字符串");
//        for (Map<String, String> mapList : listObjectSec) {
//            for (Map.Entry entry : mapList.entrySet()) {
//                System.out.println(entry.getKey() + "  " + entry.getValue());
//            }
//        }
//        //第三种方式
//        JSONArray listObjectThir = JSONArray.parseArray(strArr);
//        System.out.println("利用JSONArray中的parseArray方法来解析json数组字符串");
//        for (Object mapList : listObjectThir) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//        //第四种方式
//        List listObjectFour = JSONArray.parseArray(strArr, Map.class);
//        System.out.println("利用JSONArray中的parseArray方法并指定返回类型来解析json数组字符串");
//        for (Object mapList : listObjectFour) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//        //第五种方式
//        JSONArray listObjectFifth = JSONObject.parseArray(strArr);
//        System.out.println("利用JSONObject中的parseArray方法来解析json数组字符串");
//        for (Object mapList : listObjectFifth) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//        //第六种方式
//        List listObjectSix = JSONObject.parseArray(strArr, Map.class);
//        System.out.println("利用JSONObject中的parseArray方法并指定返回类型来解析json数组字符串");
//        for (Object mapList : listObjectSix) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//        //第七种方式
//        JSONArray listObjectSeven = JSON.parseArray(strArr);
//        System.out.println("利用JSON中的parseArray方法来解析json数组字符串");
//        for (Object mapList : listObjectSeven) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//        //第八种方式
//        List listObjectEigh = JSONObject.parseArray(strArr, Map.class);
//        System.out.println("利用JSON中的parseArray方法并指定返回类型来解析json数组字符串");
//        for (Object mapList : listObjectEigh) {
//            for (Object entry : ((Map) mapList).entrySet()) {
//                System.out.println(((Map.Entry) entry).getKey() + "  " + ((Map.Entry) entry).getValue());
//            }
//        }
//
//        // map集合遍历
//        Map<String, String> tempMap = new HashMap<String, String>();
//        tempMap.put("a", "12");
//        tempMap.put("b", "34");
//        tempMap.put("c", "56");
//
//        // 遍历方法一 hashmap entrySet() 遍历
//        Iterator it = tempMap.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println("key=" + key + " value=" + value);
//        }
//
//
//        // 遍历方法二
//        for (Map.Entry<String, String> entry : tempMap.entrySet()) {
//            String key = entry.getKey().toString();
//            String value = entry.getValue().toString();
//            System.out.println("key=" + key + " value=" + value);
//        }
//
//
//        // 遍历方法三 hashmap keySet() 遍历
//        for (Iterator i = tempMap.keySet().iterator(); i.hasNext(); ) {
//            Object obj = i.next();
//            System.out.println(obj);// 循环输出key
//            System.out.println("key=" + obj + " value=" + tempMap.get(obj));
//        }
//        for (Iterator i = tempMap.values().iterator(); i.hasNext(); ) {
//            Object obj = i.next();
//            System.out.println(obj);// 循环输出value
//        }
//
//        // 遍历方法四 treemap keySet()遍历
//        for (Object o : tempMap.keySet()) {
//            System.out.println("key=" + o + " value=" + tempMap.get(o));
//        }
//
//
//        // java如何遍历Map <String, ArrayList> map = new HashMap <String,
//        // ArrayList>();
//        System.out.println("java  遍历Map <String, ArrayList> map = new HashMap<String, ArrayList>();");
//        Map<String, ArrayList> map = new HashMap<String, ArrayList>();
//        Set<String> keys = map.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            ArrayList arrayList = map.get(key);
//            for (Object o : arrayList) {
//                System.out.println(o);
//            }
//        }
//
//        Map<String, List> map1 = new HashMap<String, List>();
//        for (Map.Entry entry : map1.entrySet()) {
//            String key = entry.getKey().toString();
//            List<String> list = (List) entry.getValue();
//            for (String value : list) {
//                System.out.println(key + "====" + value);
//            }
//        }

//
//        Date dayAgoEndDate = getDayAgoEndDate(new Date(), 1);
//        System.out.println(dayAgoEndDate);

    }

    public static Date getDayAgoEndDate(Date date, Integer day) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        //5是传的参数 就是说要获取几天后的当前具体时间
        c.add(Calendar.DAY_OF_MONTH, day);
        Date time = c.getTime();
        return time;
    }
}