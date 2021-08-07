package date2021.month7.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Test
 * @description: 多线程场景下使用 ArrayList
 * @packagename: com.lk.date2021.month7
 * @author: LiKai
 * @date: 2021-07-17 23:31
 **/
public class ArrayListSafeTest4 {
    public static void main(String[] args) throws InterruptedException {

        ThreadLocal<List<Object>> threadList = new ThreadLocal<List<Object>>() {
            @Override
            protected List<Object> initialValue() {
                return new ArrayList<Object>();
            }
        };
        //final List<Integer> list = new ArrayList<Integer>();
//        List<Object> list = new CopyOnWriteArrayList<Object>();
        // 线程A将1-1000添加到列表
//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                for (int i = 1; i < 5000; i++) {
//
//                    threadList.add(i);
//                    threadList.
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//
//        }).start();
//
//        // 线程B将1001-2000添加到列表
//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                for (int i = 5001; i < 10000; i++) {
//                    threadList.add(i);
//
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//
//        }).start();

//        Thread.sleep(1000);
//
//        // 打印所有结果
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("第" + (i + 1) + "个元素为：" + list.get(i));
//        }
    }
}