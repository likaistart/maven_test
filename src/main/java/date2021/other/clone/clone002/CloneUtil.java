package date2021.other.clone.clone002;

import java.io.*;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.other.clone002
 * @author: LiKai
 * @date: 2021-08-02 23:37
 **/

public class CloneUtil {
    public static <T extends Serializable> T clone(T obj) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream ous = new ByteArrayOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(ous);
        objectOutput.writeObject(obj);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(ous.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return (T) objectInputStream.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        System.out.println(teacher);
        System.out.println(teacher.getName());

        Teacher teacher1 = CloneUtil.clone(teacher);

        System.out.println(teacher1);
        System.out.println(teacher1.getName());
    }
}

