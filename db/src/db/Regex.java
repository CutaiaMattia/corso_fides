package db;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public boolean isCheck(String toValidate) {
        String regex = "([A-Z]{2})([0-9]{4})([A-Z]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(toValidate);

        return matcher.find();
    }
}
