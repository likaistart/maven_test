package date2021.oldpackage;

/**
 * @program: Test
 * @description:
 * @packagename: com.lk.date2021
 * @author: LiKai
 * @date: 2021-07-16 10:22
 **/
class Student {

    private String name;

    private double age;

    public Student(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Perosn [name=" + name + ", age=" + age + "]";
    }
}