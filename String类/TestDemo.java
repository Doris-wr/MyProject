package src.String类;

public class TestDemo {
    public static void main1(String[] args) {
        String str1="abcdef";
        String str2=new String("abcde");
        System.out.println(str1==str2);   //fale
        String str3="abc"+"def";//常量拼，在编译期间已经处理为abcdef，两个常量拼接完之后也在常量池，因为常量池中已经存在abcdef的地址，所以直接指向
        System.out.println(str1==str3);   //true
        String str4="abc"+new String("def");
        System.out.println(str1==str4);  //false
        String str5="abc";
        String str6="def";
        String str7=str5+str6;
        System.out.println(str1==str7);    //false
    }
    public static void main(String[] args) {
        char[]arr={'a','b','c','d','e','f'};
        String str2=new String(arr).intern();//将对象入池
        String str1="abcdef";
        System.out.println(str1==str2);
    }
}
