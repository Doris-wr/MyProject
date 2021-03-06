package lab;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.List;

//详情页下载提取
public class 详情页下载提取Demo {
    public static void main(String[] args) throws IOException {
        //无界面的浏览器（HTTP客户端）
        try (WebClient webClient = new WebClient(BrowserVersion.CHROME)) {
            //关闭了浏览器的css执行引擎，不再执行网页中的css布局
            webClient.getOptions().setCssEnabled(false);
            //关闭了浏览器的js执行引擎，不再执行网页中的js脚本
            webClient.getOptions().setJavaScriptEnabled(false);
            String url = "https://so.gushiwen.org/shiwenv_45c396367f59.aspx";
            HtmlPage page = webClient.getPage(url);
            HtmlElement body = page.getBody();
            /*List<HtmlElement> elements = body.getElementsByAttribute(
                    "div",
                    "class",
                    "contson"
            );

            for (HtmlElement element : elements) {
                System.out.println(element);
            }
            //打印第一首诗的正文信息
            System.out.println(elements.get(0).getTextContent().trim());*/
            //下面是以xpath的方式获取正文信息

            // 标题
            {
                String xpath = "//div[@class='cont']/h1/text()";
                Object o = body.getByXPath(xpath).get(0);
                DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            //朝代
            {
                String xpath = "//div[@class='cont']/p[@class='source']/a[1]/text()";
                Object o = body.getByXPath(xpath).get(0);
                DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            //作者
            {
                String xpath = "//div[@class='cont']/p[@class='source']/a[2]/text()";
                Object o = body.getByXPath(xpath).get(0);
                DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            //正文
            {
                String xpath = "//div[@class='cont']/div[@class='contson']";
                Object o = body.getByXPath(xpath).get(0);
                HtmlElement element = (HtmlElement)o;
                System.out.println(element.getTextContent().trim());
            }
        }
    }
}
