package date2021.date.utils;

import date2021.date.constant.WorkerConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @program: zhujia-java-user-center
 * @description: 字符串工具类
 * @packagename: com.jdd.zhujia.user.utils
 * @author: LiKai
 * @date: 2021-07-03 10:03
 **/
public class StringOptimizedUtil {
    private StringOptimizedUtil() {

    }

    public static String discardLastChar(String oldStr) {
        if (StringUtils.isEmpty(oldStr)) {
            return "";
        }
        return oldStr.substring(0, oldStr.length() - 1);
    }

    /**
     * 功能描述: 使用字符替换指定位置的字符
     * 〈〉
     *
     * @Param: oldStr:旧字符串 例如:[0,0,0,0]
     * @Param: newChar:需要替换的新字符 例如:'1'
     * @Param: indexNum:需要替换的索引 例如:1
     * @Return:例如:[0,1,0,0]
     * @Author: Likai
     * @Date: 2021/7/7 18:06
     */
    public static String replaceAsignStr(String oldStr, String newChar, Integer indexNum, String splitChar) {
        if (StringUtils.isEmpty(oldStr) || StringUtils.isEmpty(newChar)) {
            return oldStr;
        }
        String[] lytype = oldStr.split(splitChar);
        if (lytype.length <= indexNum) {
            return oldStr;
        }
        lytype[indexNum] = newChar;
        StringBuilder sb = new StringBuilder();
        String appendSplitFlag = splitChar;
        if (splitChar.equals(WorkerConstant.COUNTY_SPLIT_SIGN)) {
            appendSplitFlag = WorkerConstant.COUNTY_APPEND_SPLIT_SIGN;
        }
        if (lytype != null && lytype.length > 0) {
            for (int i = 0; i < lytype.length; i++) {
                if (i < lytype.length - 1) {
                    sb.append(lytype[i] + appendSplitFlag);
                } else {
                    sb.append(lytype[i]);
                }
            }
        }
        return sb.toString();
    }

    /**
     * 判断一个 string 类型的字符串是不是一个数字
     *
     * @param str string 类型的字符串
     * @return <code>true</code> 该 string 类型的字符串是十进制正整数. 其他的会返回<code>false</code>
     */
    public static boolean judgeByToCharArray(String str) {
        // null or empty
        if (str == null || StringUtils.isEmpty(str)) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    /**
     * 判断一个 string 类型的字符串是不是一个数字
     *
     * @param str string 类型的字符串
     * @return <code>true</code> 该 string 类型的字符串是十进制正整数. 其他的会返回<code>false</code>
     */
    public static boolean judgePositiveByToCharArray(String str) {
        // null or empty
        if (str == null || StringUtils.isEmpty(str)) {
            return false;
        }
        // 判断是否是整数
        boolean isDigit = str.chars().allMatch(Character::isDigit);
        if (!isDigit) {
            return isDigit;
        }
        Integer integer = Integer.valueOf(str);
        if (integer < 0) {
            return false;
        }
        return true;
    }


    /**
     * 判断一个 string 类型的字符串是不是一个数字
     *
     * @param str string 类型的字符串
     * @return <code>true</code> 该 string 类型的字符串是十进制正整数. 其他的会返回<code>false</code>
     */
    public static boolean judgeIntegerByToCharArray(String str) {
        // null or empty
        if (str == null || StringUtils.isEmpty(str)) {
            return false;
        }
        // 判断是否是整数
        boolean isDigit = str.chars().allMatch(Character::isDigit);
        if (!isDigit) {
            return isDigit;
        }
        return true;
    }

    /**
     * 判断一个 string 类型的字符串是不是一个数字
     *
     * @param integer Integer 类型的字符串
     * @return <code>true</code> 判断指定整数是否为正数
     */
    public static boolean judgetIntegerPositive(Integer integer) {
        // null or negative or zero
        if (integer == null || integer < 1) {
            return false;
        }
        return true;
    }

    /**
     * 功能描述: <br>
     * 〈〉
     *
     * @Param: [beginInteger, endInteger]
     * @Return: boolean
     * @Author: Likai
     * @Date: 2021/7/10 10:20
     */
    public static boolean judgetIntergerConform(Integer curInteger, Integer minInteger, Integer maxInteger) {
        // null or negative or zero
        if (curInteger == null || minInteger == null || maxInteger == null) {
            return false;
        }
        if (curInteger < minInteger || curInteger > maxInteger) {
            return false;
        }
        return true;
    }

    /**
     * 功能描述: 将List转为String
     * 〈〉
     *
     * @Param: [certiIds]
     * @Return: java.lang.String
     * @Author: Likai
     * @Date: 2021/7/29 19:51
     */
    public static String getStringFromList(Set<String> idsList) {
        if (CollectionUtils.isEmpty(idsList)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : idsList
        ) {
            stringBuilder.append(str).append(WorkerConstant.SPLIT_SIGN);
        }
        return StringOptimizedUtil.discardLastChar(stringBuilder.toString());
    }

    /**
     * 功能描述: 将
     * 〈〉
     *
     * @Param: [strs]
     * @Return: java.util.List<java.lang.String>
     * @Author: Likai
     * @Date: 2021/7/30 10:56
     */
    public static List<String> StrToList(String strs, String splitFlag) {
        if (StringUtils.isEmpty(strs)) {
            return Collections.emptyList();
        }
        String[] split = strs.split(splitFlag);
        List newList = new ArrayList();
        for (String str : split) {
            if (StringUtils.isEmpty(str)) {
                continue;
            }
            newList.add(str);
        }
        return newList;
    }
}