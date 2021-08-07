package date2021.month7.day23;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month7.day23
 * @author: LiKai
 * @date: 2021-07-23 15:13
 **/
public class UpperString {
    public static void main(String[] args) {
        //受理状态1待处理2待举证3待裁决4已裁决5已申诉待处理6投诉关闭
//        String a3 = "plan_arbitrament";
//        String a4 = "had_arbitrament";
//        String a5 = "appeal_plan_deal";
//
//        System.out.println(a3.toUpperCase());
//        System.out.println(a4.toUpperCase());
//        System.out.println(a5.toUpperCase());
//        String str = "[{\"11\":\"2\"},{\"21\":\"3\"}]";
//        Set<String> noRepetitionIds1 = getNoRepetitionIds1(str);
//        System.out.println(noRepetitionIds1);

        String a3 = "division";

        System.out.println(a3.toUpperCase());
    }


    public static Set<String> getNoRepetitionIds1(String jsonStr) {
        Set<String> setIds = new HashSet<>();
        JSONArray jsonArray = JSON.parseArray(jsonStr);
        int size = jsonArray.size();
        for(int i=0;i<size;i++){
            Iterator<Map.Entry<String, Object>> iterator = ((JSONObject) jsonArray.get(i)).entrySet().iterator();
            if(iterator.hasNext()){
                String key = iterator.next().getKey();
                setIds.add(key);
            }

        }
        return setIds;
    }

//        ArrayList<String> stringArray = new ArrayList<String>();
//        Set<String> setIds = new HashSet<>();
//        JSONArray jsonArray = new JSONArray(Collections.singletonList(jsonString));
//        return setIds;
//        for (int i = 0; i < jsonArray.length(); i++) {
//            stringArray.add(jsonArray.getString(i));
//        }
//
//        Set<String> setIds = new HashSet<>();
//        String[] split = oldIds.split(",");
//        if (split.length < 1) {
//            return setIds;
//        }
//        for (String str : split) {
//            setIds.add(str);
//        }
//        return setIds;
}


