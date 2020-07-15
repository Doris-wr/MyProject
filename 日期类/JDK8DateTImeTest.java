package 常用类.日期类;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author:wangrui
 * @Date:2020/3/8 17:19
 */
public class JDK8DateTImeTest {
     @Test
     /*
      * 功能描述:LocalDate ,LocalTime,LocalDateTime的使用
        * LocalDateTime 相较于LocaDate,LocalTime的使用频率要搞
      * @return void
      */
    public void test1(){
        //now():获取当前的日期，时间，日期+时间
         LocalDate localDate=LocalDate.now();
         LocalTime localTime=LocalTime.now();
         LocalDateTime localDateTime=LocalDateTime.now();
         System.out.println(localDate);
         System.out.println(localTime);
         System.out.println(localDateTime);
         //of()：设置指定的年，日，时，分秒，没有偏移量
        // LocalDateTime localDateTime1=LocalDateTime.of();

     }
}
