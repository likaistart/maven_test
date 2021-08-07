package date2021.other.reflect;

/**
 * @program: maven_test
 * @url:
 * @description:
 * @packagename: date2021.other.reflect
 * @author: LiKai
 * @date: 2021-08-02 23:58
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("date2021.other.reflect.User"); //1方法一
        User user = (User) clazz.newInstance();
        ClassLoader c  = Test.class.getClassLoader();  //获取Test类的类加载器
// User user=User.class.newInstance(); //2 方法二

//        User user2=new User(); //3 方法三
//        User user=user2.getClass().newInstance();
        user.setId(10);
        user.setUserName("小浩");
        user.setPassword("123456");
        System.out.println(user);

    }
}

