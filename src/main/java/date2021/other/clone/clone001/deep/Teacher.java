package date2021.other.clone.clone001.deep;

import date2021.other.clone.clone001.shallow.Student;

import java.io.*;

/**
 * @program: maven_test
 * @url: https://blog.csdn.net/csdn_heliu/article/details/87357223
 * @description: 3.使用深克隆解决
 * @packagename: date2021.other.clone001
 * @author: LiKai
 * @date: 2021-08-02 22:10
 **/
class Teacher implements Serializable {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString() {
        return "Teacher [name=" + name + ", student=" + student + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        //注意以下代码
        Teacher teacher = (Teacher)super.clone();
        teacher.setStudent((Student)teacher.getStudent().clone());
        return teacher;
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student s1 = new Student(20, "张三");
        s1.setAge(20);
        s1.setName("张三");
        Teacher teacher1 = new Teacher();
        teacher1.setName("小赵老师");
        teacher1.setStudent(s1);
//        Teacher teacher2 = (Teacher)teacher1.clone();
        //Teacher teacher2 = (Teacher) clone(teacher1);
        Teacher teacher2 = clone(teacher1);
        teacher2.setName("小明老师");
        Student s2 = teacher2.getStudent();
        s2.setName("李四");
        s2.setAge(30);
        System.out.println("teacher1:"+teacher1);
        System.out.println("teacher2:"+teacher2);

    }


    public static <T extends Serializable> T clone(T obj) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream ous = new ByteArrayOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(ous);
        objectOutput.writeObject(obj);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(ous.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return (T) objectInputStream.readObject();
    }
}