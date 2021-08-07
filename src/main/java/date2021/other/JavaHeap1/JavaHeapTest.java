package date2021.other.JavaHeap1;

/**
 * @program: https://www.cnblogs.com/cenyu/p/6289209.html
 * @url:
 * @description:
 * @packagename: date2021.other.Proxy.method
 * @author: LiKai
 * @date: 2021-08-03 23:39
 **/

public class JavaHeapTest {
    //public final static int OUTOFMEMORY = 200000000;
    public final static int OUTOFMEMORY = 200000;
    private String oom;
    private int length;
    StringBuffer tempOOM = new StringBuffer();

    public JavaHeapTest(int leng) {
        this.length = leng;
        int i = 0;
        while (i < leng) {
            i++;
            try {
                tempOOM.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.oom = tempOOM.toString();
    }

    public String getOom() {
        return oom;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        JavaHeapTest javaHeapTest = new JavaHeapTest(OUTOFMEMORY);
        System.out.println(javaHeapTest.getOom().length());
    }
}
