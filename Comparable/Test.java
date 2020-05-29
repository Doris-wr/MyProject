package 对象的比较.Comparable;

/**
 * @Author:wangrui
 * @Date:2020/5/28 10:26
 */
public class Test {
    public static void main(String[] args) {
        Person p1=new Person("wangrui",21);
        Person p2=new Person("zhangsan",19);
        int n=p1.compareTo(p2);
        if(n>0){
            System.out.println("p1的年龄大");
        }else if(n==0){
            System.out.println("p1和p2的年龄一样大");
        }else{
            System.out.println("p2的年龄大");
        }
    }
}
