package date2021.other.clone.clone002;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.other.clone002
 * @author: LiKai
 * @date: 2021-08-02 23:35
 **/
import java.io.Serializable;

public class Teacher implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
