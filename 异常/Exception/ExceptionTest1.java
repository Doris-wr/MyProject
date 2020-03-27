package 异常.Exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        String str="123";
        str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println("hello-------1");
        }catch(NullPointerException e){
            System.out.println("出现空指针异常了，不要着急……");
        }catch(NumberFormatException e){
            //方式一
            System.out.println("出现数值转换异常了，不要着急……");
            //方式二
            System.out.println(e.getMessage());
            //方式三
            //e.printStackTrace();
        }catch(Exception e){//
            System.out.println("出现异常了，不要着急……");
        }
    }
}
