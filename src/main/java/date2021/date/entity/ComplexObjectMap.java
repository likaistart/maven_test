package date2021.date.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: zhujia-java-user-center
 * @description: 构建对象Map
 * @packagename: com.jdd.zhujia.user.moudel.request
 * @author: LiKai
 * @date: 2021-07-29 20:23
 **/
@Data
public class ComplexObjectMap {
    private String key;
    private List<String> stringList;
}