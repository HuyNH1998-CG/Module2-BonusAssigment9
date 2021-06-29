import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static final String emailRegex = "^\\w+\\w@\\w+(\\.\\w+)$";
    public EmailRegex(){
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
