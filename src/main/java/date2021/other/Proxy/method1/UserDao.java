package date2021.other.Proxy.method1;

/**
 * @program: 接口实现  目标对象
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method
 * @author: LiKai
 * @date: 2021-08-03 22:28
 **/
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}