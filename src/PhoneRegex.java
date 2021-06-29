import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    public static final String phoneRegex = "^[(]\\d{2}[)]-[(][0]\\d{9}[)]$";
    public PhoneRegex(){}
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
