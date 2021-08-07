package date2021.date.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import date2021.date.constant.WorkerConstant;
import date2021.date.entity.ComplexObjectMap;
import date2021.date.entity.ObjectMap;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @program: zhujia-java-user-center
 * @description: 集合工具类
 * @packagename: com.jdd.zhujia.user.utils
 * @author: LiKai
 * @date: 2021-07-02 18:36
 **/
public class CollectionUtil {
    private CollectionUtil() {
    }

    public static Set<Integer> getNoRepetitionIds(String oldIds) {
        Set<Integer> setIds = new HashSet<>();
        if (StringUtils.isEmpty(oldIds)) {
            return setIds;
        }
        String[] split = oldIds.split(WorkerConstant.SPLIT_SIGN);
        if (split.length < 1) {
            return setIds;
        }
        for (String str : split) {
            if (StringOptimizedUtil.judgeIntegerByToCharArray(str))
                setIds.add(Integer.valueOf(str));
        }
        return setIds;
    }


    public static Set<String> getNoRepetIdsStr(String oldIds) {
        Set<String> setIds = new HashSet<>();
        if (StringUtils.isEmpty(oldIds)) {
            return setIds;
        }
        String[] split = oldIds.split(WorkerConstant.SPLIT_SIGN);
        if (split.length < 1) {
            return setIds;
        }
        for (String str : split) {
            setIds.add(str);
        }
        return setIds;
    }


    /**
     * 功能描述: 获取不重复的id
     * 〈〉
     *
     * @Param: [jsonStr] [[{"11":"2"},{"21":"3"}]]
     * @Return: java.util.Set<java.lang.String>
     * @Author: Likai
     * @Date: 2021/7/26 14:43
     */
    public static Set<String> getNoRepetitionIds1(String jsonStr) {
        Set<String> setIds = new HashSet<>();
        JSONArray jsonArray = JSON.parseArray(jsonStr);
        int size = jsonArray.size();
        for (int i = 0; i < size; i++) {
            Iterator<Map.Entry<String, Object>> iterator = ((JSONObject) jsonArray.get(i)).entrySet().iterator();
            if (iterator.hasNext()) {
                String key = iterator.next().getKey();
                setIds.add(key);
            }

        }
        return setIds;
    }


    /**
     * 功能描述: 将字符串转换为对象列表
     * 〈〉
     *
     * @Param: [str]
     * @Return: java.util.List<com.jdd.zhujia.user.moudel.request.ObjectMap>
     * @Author: Likai
     * @Date: 2021/8/3 15:03
     */
    public static List<ObjectMap> strToObjectList(String str) {
        //字符串为空,传一个空数组
        if (StringUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        List<ObjectMap> objectMaps = new ArrayList<>();
        JSONArray objects = JSON.parseArray(str);
        for (int i = 0; i < objects.size(); i++) {
            Map mapTypes = (Map) JSON.parseArray(str).get(i);
            for (Object obj : mapTypes.keySet()) {
                ObjectMap objectMap = new ObjectMap();
                objectMap.setKey(String.valueOf(obj));
                objectMap.setValue(String.valueOf(mapTypes.get(obj)));
                objectMaps.add(objectMap);
            }
        }
        return objectMaps;
    }


    /**
     * 功能描述: 将字符串转换为对象列表
     * 〈〉
     *
     * @Param: [str]
     * @Return: java.util.List<com.jdd.zhujia.user.moudel.request.ObjectMap>
     * @Author: Likai
     * @Date: 2021/8/3 15:03
     */
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
                complexMap.setStringList(repGroup);
                complexMaps.add(complexMap);
            }
        }
        return complexMaps;
    }


    /**
     * 功能描述: 将字符串转换为对象列表
     * 〈〉
     *
     * @Param: [str]
     * @Return: java.util.List<com.jdd.zhujia.user.moudel.request.ObjectMap>
     * @Author: Likai
     * @Date: 2021/8/3 15:03
     */
//    public static List<ObjectMap> strToObjectList(String str) {
//        //字符串为空,传一个空数组
//        if (StringUtils.isEmpty(str)) {
//            return Collections.emptyList();
//        }
//        List<ObjectMap> complexMaps = new ArrayList<>();
//        JSONArray objects = JSON.parseArray(str);
//        for (int i = 0; i < objects.size(); i++) {
//            Map mapTypes = (Map) JSON.parseArray(str).get(i);
//            for (Object obj : mapTypes.keySet()) {
//                ObjectMap complexMap = new ObjectMap();
//                complexMap.setKey(String.valueOf(obj));
//                // complexMap.setKey(String.valueOf(obj));
////                String[] strings = ((JSONArray) mapTypes.get(obj)).toArray(new String[]{});
////                List<String> repGroup = new ArrayList<>(Arrays.asList(strings));
//                complexMap.setValue(mapTypes.get(obj).toString());
//                complexMaps.add(complexMap);
//            }
//        }
//        return complexMaps;
//    }

}