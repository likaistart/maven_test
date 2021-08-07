package date2021.month7.day19;

import java.util.*;

/**
 * @program: Test
 * @description:
 * @packagename: com.lk.date2021.month7.day19
 * @author: LiKai
 * @date: 2021-07-19 21:18
 **/
public class MapToStringTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","1");
        map.put("3","2");
//        String mapToString = getMapToString(map);
//        System.out.println(mapToString);

//        String str="免抽佣";
//        String format = String.format(str, "233");
//        String format1 = str.replace("$value",String.valueOf(1));
//        System.out.println(format1);
        Map<String,String> map1=new HashMap<String,String>();
        map1.put("1","a");
        map1.put("1","a1");
        map1.put("1","a1");
        Iterator<Map.Entry<String, String>> iterator = map1.entrySet().iterator();
        if(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());

        }



    }

    private static Map<String, String> getMap1(Map<String, String> map1) {
        return map1;
    }
    // 参数类型是Map<String,String> 因为支付只能用string的参数。如果诸君还需要修改的话，那也可以适当的做调整
    /**
     *
     * map转str
     * @param map
     * @return
     */
    public static String getMapToString(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        // 将set集合转换为数组
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        // 给数组排序(升序)
        Arrays.sort(keyArray);
        // 因为String拼接效率会很低的，所以转用StringBuilder。博主会在这篇博文发后不久，会更新一篇String与StringBuilder开发时的抉择的博文。
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            // 参数值为空，则不参与签名 这个方法trim()是去空格
            if (map.get(keyArray[i]).trim().length() > 0) {
                sb.append(keyArray[i]).append("=").append(map.get(keyArray[i]).trim());
            }
            if (i != keyArray.length - 1) {
                sb.append("&");
            }
        }
        return sb.toString();
    }
}