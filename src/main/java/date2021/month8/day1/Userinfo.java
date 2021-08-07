package date2021.month8.day1;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.month8
 * @author: LiKai
 * @date: 2021-08-02 18:07
 **/
import java.io.Serializable;

public class Userinfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    public int getid() {

        return id;

    }

    public void setid(int id) {

        this.id = id;

    }

    public String getname() {

        return name;

    }

    public void setname(String name) {

        this.name = name;

    }

}