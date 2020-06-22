/*
package File.练习题;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

*/
/**
 * @Author:wangrui
 * @Date:2020/2/16 22:07
 * 1.遍历文本每一个字符
 * 2.字符出现的次数存在Map中
 * 3.把Map的数据写入文件
 *//*

public class WordCount {
    @Test
    public void testWordCount(){
        FileReader fr=null;
        FileWriter bw=null;
        try{
            //1.创建Map集合
            Map<Character,Integer> map=new HashMap<>();
            //2.遍历每一个字符，每一个字符出现的次数放到Map中
            fr=new FileReader("hello.txt");
            int c=0;
            while((c=fr.read())!=-1)){
                char ch= (char) c;
                if ((map.get(ch) == null)) {
                    map.put(ch, 1);
                }else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            //3.把map中数据存在文件Count.txt
            //3.1 创建Writer
            bw=new BufferedWriter(new FileWriter("wordcount.txt"));
            //3.2 遍历map，再写入数据
            Set<Map,Map.Entry<Character,Integer>>entrySet=map.entrySet();
            for(Map.Entry<Character,Integer>entry:entrySet){
                switch(entry.getKey()){
                    case:
                        bw.write("空格"+entry.getValue());
                        break;
                }
            }

        }
    }
}
*/
