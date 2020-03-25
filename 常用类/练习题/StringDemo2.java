package 常用类.练习题;

import org.junit.Test;

/**
 * @Author:wangrui
 * @Date:2020/3/8 14:30
 */
public class StringDemo2 {
    /*
     * 功能描述:获取一个字符串在另一个字符串中出现的次数
     * @return int
     */
    public int getCount(String mainStr,String subStr){
        int mainLength=mainStr.length();
        int subLength=subStr.length();
        int count=0;
        int index=0;
        if(mainLength>=subLength){
              //方式一
              /*while((index=mainStr.indexOf(subStr))!=-1){
                  count++;
                  mainStr=mainStr.substring(index+subStr.length());
              }*/
              //方式二：堆方式一的改进
              while((index=mainStr.indexOf(subStr,index))!=-1) {
                  count++;
                  index+=subLength;
              }
              return count;
        }else{
            return 0;
        }
    }
    @Test
    public void testGetCunt(){
        String mainStr="abkkcadkabkefkaabkskab";
        String subStr="ab";
        int count=getCount(mainStr,subStr);
        System.out.println(count);
    }
}
