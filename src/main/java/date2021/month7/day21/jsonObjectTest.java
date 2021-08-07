package date2021.month7.day21;

import java.util.*;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month7.day21
 * @author: LiKai
 * @date: 2021-07-21 15:19
 **/
public class jsonObjectTest {
    public static void main(String[] args) {
////        JSONObject obj = new JSONObject();
////        {
////            obj.put("key1", "value1");
////            obj.put("key2", "value2");
////            obj.put("key3", "value3");
////        }
////        Map<String, String> params = JSONObject.parseObject(obj.toJSONString(), new TypeReference<Map<String, String>>(){});
////        System.out.println(params);
//        String str = "[{\"1\":\"1\"},{\"11\":\"1\"}]";
//        Object arrayList = JSONObject.parse(str);
//        JSONObject obj = new JSONObject();
//        JSONArray arrayList1 = (JSONArray) arrayList;
//        int size = ((JSONArray) arrayList).list.size();
//        for (int i = 0; i < size; size++) {
//            String string = ((JSONArray) arrayList).getString(i);
//            HashMap hashMap = JSON.parseObject(string, HashMap.class);
//
//        }

        String strArr = "[{\"1\": \"1\", \"1\": \"1\"},{\"1\": \"1\", \"1\": \"1\"}]";
        //第一种方式
//        List<Map<String,String>> listObjectFir = (List<Map<String,String>>) JSONArray.parse(strArr);
//        System.out.println("利用JSONArray中的parse方法来解析json数组字符串");
//        for(Map<String,String> mapList : listObjectFir){
//            for (Map.Entry entry : mapList.entrySet()){
//                System.out.println( entry.getKey()  + "  " +entry.getValue());
//            }
//        }


    }
}