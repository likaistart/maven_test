package date2021.other.clone.clone002;

/**
 * @program: maven_test
 * @description:
 * @packagename: date2021.other.clone002
 * @author: LiKai
 * @date: 2021-08-02 23:35
 **/

public class Student implements Cloneable{
    private String name;

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        Student student1 = (Student) student.clone();
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student.getName());
        System.out.println(student1.getName());
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
