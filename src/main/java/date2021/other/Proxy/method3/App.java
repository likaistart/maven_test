package date2021.other.Proxy.method3;

import org.junit.Test;

/**
 * @program: 测试类
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method3
 * @author: LiKai
 * @date: 2021-08-04 00:34
 **/
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
    public void test() {

    }
}