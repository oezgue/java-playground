import java.util.HashMap;
import java.util.Map;

public class MainTest {
    final static int FUNF = 5;

    public static void main(String[] args) {

        System.out.println("hallo");
        String s = "Hallo ich bin ein String.";
        char[] charArray = {'a','b','c'};

        char[] value = new char[s.length()];
        value[2] = 'a';
        StringBuilder sb = new StringBuilder();
        s = String.valueOf(charArray);
        System.out.println(value);
        sb.append('i');
        //System.out.println(sb);

        String str = sb.toString();
        //System.out.println(str);
        System.out.println(value.toString());

    }
}
