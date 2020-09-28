
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

    public static void main(String[] args) {
        String s = "<tr><td>ȫ�浿</td><td>18</td></tr><tr><td>�Ӳ���</td><td>19</td></tr>" +
                   "<span>false</span><div><span>true</span></div>";
        
        String regex ="<([a-z]+)>([^<]+)</[a-z]+>"; //�����Դ�
//        String regex ="<([a-z]+)>([^<]+)"; //�����Ѵ�
//        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = Pattern.compile(regex).matcher(s);
        while (matcher.find()) {
        	System.out.println("TAG:"+matcher.group(1)+" TEXT:"+matcher.group(2));
        }

    }
}

