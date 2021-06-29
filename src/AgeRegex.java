import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeRegex {
    public static final String ageRegex = "^\\d+$";

    public AgeRegex(){
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(ageRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
