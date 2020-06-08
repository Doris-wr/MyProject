package dao;

/**
 * @Author:wangrui
 * @Date:2020/5/28 11:55
 */
public class Person {
    private String name;
    private int age;
    private int tel;
    private String addr;

    public Person() {
    }

    public Person(String name, int age, int tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "[姓名："+name+",年龄："+age
                +",电话："+tel+",地址："+addr+"]";
    }
}
