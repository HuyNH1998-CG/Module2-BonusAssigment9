import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderRegex {
    private static final String genderRegex = "^[Nn][aA][mM]+|[Nn][uU]$";

    public GenderRegex() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(genderRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
