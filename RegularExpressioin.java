import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressioin {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[0-9]{10}");
        Matcher m =p.matcher("8077050007");
        int c=0;
        while(m.find())
        {
            c++;
        }
        System.out.println(c);
    }
}
