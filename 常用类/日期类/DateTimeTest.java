package 常用类.日期类;

import org.junit.Test;

/**
 * @Author:wangrui
 * @Date:2020/3/8 11:21
 */
public class DateTimeTest {
    @Test
    /*
     * 功能描述:System类中的currentTimeMillis()
     * @return void
     */
    public void test1(){
        long time=System.currentTimeMillis();
        //返回当前时间与1970年1月time一日0分0秒之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }
    //java.util.Date类
         //java.sql,util类
}
