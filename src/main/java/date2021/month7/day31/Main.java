package date2021.month7.day31;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month7.day31
 * @author: LiKai
 * @date: 2021-07-31 00:30
 **/
public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");

        list.forEach(p->{
            System.out.println(p);
        });
    }
}