package date2021.month8.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month8
 * @author: LiKai
 * @date: 2021-08-02 18:06
 **/
public class Testmain {
    /**
     * @param args
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String str="12|3|123,32,13,213,21321|32|321";
        String str1="12,3";

        System.out.println(str.contains(str1));

//        // todo auto-generated method stub
//
//        List src = new ArrayList(2);
//
//        Userinfo ui1 = new Userinfo();
//
//        ui1.setid(1);
//
//        ui1.setname("aaa");
//
//        src.add(ui1);
//
//        Userinfo ui2 = new Userinfo();
//
//        ui1.setid(2);
//
//        ui1.setname("bbb");
//
//        src.add(ui2);
//
//        List dest = new ArrayList(2);
//
//        Testmain test = new Testmain();
//
//        try {
//
//            dest = test.deepcopy(src);
//
//        } catch (IOException e) {
//
//            // todo auto-generated catch block
//
//            e.printStackTrace();
//
//        } catch (ClassNotFoundException e) {
//
//            // todo auto-generated catch block
//
//            e.printStackTrace();
//
//        }
//
//        System.out.println(src == dest);
//
//        Userinfo u = (Userinfo) src.get(0);
//
//        Userinfo uu = (Userinfo) dest.get(0);
//
//        uu.setname("dkkdkddk");
//
//        System.out.println(u.getname());
//
//        System.out.println(uu.getname());


//        Set<String> str = new HashSet<>();
//        str.add("1");
//        str.add("2");
//        str.add("3");
//        str.add("4");
//        str.add("4");
//        str.add("4");
//        str.add("4");
//        str.add("4");
//        str.add("4");
//
//        List<String> str1 = new ArrayList<>();
//
//        str1.addAll(str);
//        for(String elem : str1){
//            System.out.println(elem);
//        }
//        List<String> str1=str;
//
//        Testmain test = new Testmain();
//        List deepcopy = test.deepcopy(str);
//        str.remove(0);
//        System.out.println(str);
//        System.out.println(deepcopy);
//        System.out.println(str1);


    }

    public Object deepcopy(List src) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream byteout = new ByteArrayOutputStream();

        ObjectOutputStream out = new ObjectOutputStream(byteout);

        out.writeObject(src);

        ByteArrayInputStream bytein = new ByteArrayInputStream(
                byteout.toByteArray());

        ObjectInputStream in = new ObjectInputStream(bytein);

        List dest = (List) in.readObject();

        return dest;

    }
}