package date2021.date;

import date2021.date.mapper.worker4.B2CAreaMapper;
import date2021.date.model.worker4.B2CArea;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: maven_test
 * @url:
 * @description:
 * @packagename: date2021.date
 * @author: LiKai
 * @date: 2021-08-05 09:06
 **/
@Component
public class ConnectionSQL1 {
    @Autowired
    private B2CAreaMapper b2CAreaMapper;

    @Test
    public void main1() {
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://drdsgfaf45xj3003public.drds.aliyuncs.com:3306/b2c_test?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8&serverTimezone=Asia/Shanghai";
        //MySQL配置时的用户名
        String user = "b2c_test";
        //MySQL配置时的密码
        String password = "jiangDuoDuo_20200423";


        Integer asignId=0;
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from b2c_area";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println("姓名" + "\t" + "职称");
            System.out.println("-----------------");

            String id = null;
            String title = null;
            List<B2CArea> b2CAreaList = new ArrayList<>();
            while (rs.next()) {
                B2CArea b2CArea = new B2CArea();
                //获取id这列数据
                b2CArea.setId(Integer.valueOf(rs.getString("id")));
                //获取title这列数据
                b2CArea.setTitle(rs.getString("title"));
                //获取floor这列数据
                b2CArea.setFloor(Short.valueOf(rs.getString("floor")));
                //获取parentId这列数据
                b2CArea.setParentId(Integer.valueOf(rs.getString("parent_id")));
                //获取areaCode这列数据
                b2CArea.setAreaCode(rs.getString("area_code"));
                b2CAreaList.add(b2CArea);
            }
            rs.close();
            con.close();

            ConnectionSQL1 connectionSQL = new ConnectionSQL1();
            asignId = connectionSQL.getAsignLevelByStreet(34, 4, 2,b2CAreaList);
            System.out.println(asignId);
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
            System.out.println(asignId);
        }

    }


    public Integer getAsignLevelByStreet(Integer areaId, Integer curFloor, Integer targetFloor,List<B2CArea> b2CAreaList) {
        Integer finalAreaId = areaId;
        B2CArea AreaEntity = b2CAreaList.stream().filter(a -> Integer.valueOf(a.getId()).equals(finalAreaId)).collect(Collectors.toList()).get(0);
        if (null != AreaEntity && null != AreaEntity.getParentId()) {
            Integer  parentId = AreaEntity.getParentId();
            areaId=parentId;
            if (curFloor == targetFloor) {
               return parentId;
            }
            --curFloor;
            getAsignLevelByStreet(areaId, curFloor, targetFloor,b2CAreaList);
        }

        return areaId;
    }
}