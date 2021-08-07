package date2021.other.Proxy.method1;

/**
 * @program: 测试类
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method
 * @author: LiKai
 * @date: 2021-08-03 22:28
 **/
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}