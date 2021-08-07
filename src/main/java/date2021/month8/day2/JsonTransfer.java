package date2021.month8.day2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @program: maven_test
 * @url:
 * @description: Json
 * @packagename: date2021.month8.day2
 * @author: LiKai
 * @date: 2021-08-03 14:32
 **/
public class JsonTransfer {
    public static void main(String[] args) {
        String str = "[{\"4\":[\"30\",\"4\",\"\",\"1\",\"20\"]},{\"5\":[\"30\",\"4\",\"\",\"1\",\"20\"]}]";
        System.out.println(strToComplexObjectList(str));
    }


    public static List<ComplexObjectMap> strToComplexObjectList(String str) {
        //字符串为空,传一个空数组
        if (StringUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        List<ComplexObjectMap> complexMaps = new ArrayList<>();
        JSONArray objects = JSON.parseArray(str);
        for (int i = 0; i < objects.size(); i++) {
            Map mapTypes = (Map) JSON.parseArray(str).get(i);
            for (Object obj : mapTypes.keySet()) {
                ComplexObjectMap complexMap = new ComplexObjectMap();
                complexMap.setKey(String.valueOf(obj));
                String[] strings = ((JSONArray) mapTypes.get(obj)).toArray(new String[]{});
                List<String> repGroup = new ArrayList<>(Arrays.asList(strings));
                //complexMap.setStringList(repGroup);
                //complexMaps.add(complexMap);
            }
        }
        return complexMaps;
    }


}