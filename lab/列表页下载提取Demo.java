package lab;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;
/**
 * @Author:wangrui
 * @Date:2019/11/11 23:17
 */
//HtmlUnit的预研代码
public class 列表页下载提取Demo {
    public static void main(String[] args) throws IOException {
        //无界面的浏览器（Http客户端）
        WebClient webclient=new WebClient(BrowserVersion.CHROME);
        webclient.getOptions().setJavaScriptEnabled(false);//关闭了浏览器的js执行引擎，不再执行网页中的js脚本
        webclient.getOptions().setCssEnabled(false);//关闭了浏览器的css执行引擎，不再执行网页中的css布局
        //页面下载，下载结果存在page中
        HtmlPage page=webclient.getPage("https://so.gushiwen.org/gushi/tangshi.aspx" );
        System.out.println(page);
        File file=new File("唐诗三百首\\列表页.html");
        file.delete();
        page.save(file);
        //如何从html中获取信息
        HtmlElement body=page.getBody();
        //元素名称  标签名称    标签值
       List<HtmlElement>elements= body.getElementsByAttribute(
                "div",
                "class",
                "typecont");

        /*for(HtmlElement element:elements){
            System.out.println(element);
        }*/

        int count=0;//一共320首诗
        for(HtmlElement element:elements){
            List<HtmlElement> aElements=element.getElementsByTagName("a");
            for(HtmlElement a:aElements){
                System.out.println(a.getAttribute("href"));
                count++;
            }
        }
        System.out.println(count);
    }
}
