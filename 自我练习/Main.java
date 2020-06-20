package 自我练习;

public class Main {
//    判断一个数是否是偶数
    public static boolean isEvenNum(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
//任意输入三个数，然后从大到小的顺序输出
    public static void main(String[] args) {
        System.out.println(isEvenNum(6));
    }
}


