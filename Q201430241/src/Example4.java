
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

    public static void main(String[] args) {
        String s = "<tr><td>È«±æµ¿</td><td>18</td></tr><tr><td>ÀÓ²©Á¤</td><td>19</td></tr>" +
                   "<span>false</span><div><span>true</span></div>";
        
        String regex ="<([a-z]+)>([^<]+)</[a-z]+>"; //±³¼ö´Ô´ä
//        String regex ="<([a-z]+)>([^<]+)"; //³»°¡ÇÑ´ä
//        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = Pattern.compile(regex).matcher(s);
        while (matcher.find()) {
        	System.out.println("TAG:"+matcher.group(1)+" TEXT:"+matcher.group(2));
        }

    }
}

