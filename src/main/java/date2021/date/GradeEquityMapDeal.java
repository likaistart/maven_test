package date2021.date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import date2021.date.entity.ComplexObjectMap;
import date2021.date.entity.ObjectMap;
import date2021.date.mapper.worker4.B2CAreaMapper;
import date2021.date.model.worker4.B2CArea;
import date2021.date.model.worker4.NewGradeConfig;
import date2021.date.utils.CollectionUtil;
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
public class GradeEquityMapDeal {
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


        Integer asignId = 0;
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
            String sql = "select * from b2c_worker_new_grade_config";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
//            System.out.println("-----------------");
//            System.out.println("执行结果如下所示:");
//            System.out.println("-----------------");
//            System.out.println("姓名" + "\t" + "职称");
//            System.out.println("-----------------");

            String id = null;
            String title = null;
            List<NewGradeConfig> gradeConfigs = new ArrayList<>();
            while (rs.next()) {
                NewGradeConfig gradeConfig = new NewGradeConfig();
                //获取id这列数据
                gradeConfig.setId(Integer.valueOf(rs.getString("id")));
                //获取师傅等级权益--字典表{"权益ID","对应的权益值"}
                gradeConfig.setGradeEquityMap(rs.getString("grade_equity_map"));
                gradeConfigs.add(gradeConfig);
                if(gradeConfigs.size()>0){
                    break;
                }
            }
            rs.close();
            con.close();
//            String gradeEquityMap = gradeConfigs.get(0).getGradeEquityMap();
//            JSONArray jsonArray = JSON.parseArray(gradeConfigs.get(0).getGradeEquityMap());
            List<ObjectMap> objectMapList = CollectionUtil.strToObjectList(gradeConfigs.get(0).getGradeEquityMap());


            String value = objectMapList.get(4).getValue();
            System.out.println(value);

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


    public List<Integer> getAsignLevelByStreet(List<Integer> arrayList, Integer curFloor, Integer targetFloor, List<B2CArea> b2CAreaList) {
        Integer finalAreaId = arrayList.get(0);
        List<Integer> arrayList1 = new ArrayList<>();
        B2CArea AreaEntity = b2CAreaList.stream().filter(a -> Integer.valueOf(a.getId()).equals(finalAreaId)).collect(Collectors.toList()).get(0);
        if (null != AreaEntity && null != AreaEntity.getParentId()) {
            Integer parentId = AreaEntity.getParentId();

            arrayList1.add(parentId);
            --curFloor;
            if (curFloor == targetFloor) {
                return arrayList1;
            }

            getAsignLevelByStreet(arrayList1, curFloor, targetFloor, b2CAreaList);
        }

        return arrayList1;
    }
}