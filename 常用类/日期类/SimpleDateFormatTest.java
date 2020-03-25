package 常用类.日期类;

import org.junit.Test;
import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author:wangrui
 * @Date:2020/3/8 15:57
 */
public class SimpleDateFormatTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat，使用默认的构造器
        SimpleDateFormat sdf=new SimpleDateFormat();
        //格式化：日期——>字符串
        Date date=new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析：格式化的逆过程，字符串——>日期
        String str="20-3-8 下午4:10";
        Date parse = sdf.parse(str);
        System.out.println(parse);
       //*****按照指定的方式格式化和解析，调用带参的构造器*******
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1=sdf1.format(date);
        System.out.println(format1) ;
        //解析:要求字符串的格式必须是符合SimpleDateFormat识别的格式（通过构造器参数体现）
        //否则 ，会抛出异常
        Date parse1 = sdf1.parse(format1);
        System.out.println(parse1);
    }
    @Test
    /*
     * 功能描述:  练习将“2020-09-08”转换为java.sql.Date
     * @return void
     */
    public void testExer() throws ParseException {
        String birth="2020-09-08";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf1.parse(birth);
        java.sql.Date birthday=new java.sql.Date(date.getTime());
        System.out.println(birthday);
    }
    @Test
    /*
     * 功能描述:Calender（抽象类）的使用
     * @return
     */
    public void testCalender(){
        //1.实例化
        //方式一：创建其子类（GregorianCalender）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar=Calendar.getInstance();
        //2.常用方法
        //get()
        int days=calendar.get(Calendar.DAY_OF_MONTH);//一个月的第几天
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//一年的第多少天
        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);//若是减，则将数字改为负数
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //getTime()：日历类——>Date
        Date date=calendar.getTime();
        System.out.println(date);
        //setTime():Date——>日历类
        Date date1=new Date();
        calendar.setTime(date1);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
