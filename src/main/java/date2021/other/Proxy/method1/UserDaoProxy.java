package date2021.other.Proxy.method1;

/**
 * @program: 代理对象,静态代理
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method
 * @author: LiKai
 * @date: 2021-08-03 22:28
 **/
public class UserDaoProxy implements IUserDao{
    //接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}