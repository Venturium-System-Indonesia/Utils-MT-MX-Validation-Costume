package vensys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFalsePositiveCollon {
    public static String REGEX = "^:(?!([\\w+$]{0,3}):)";
    public static boolean IsThisPositiveCollon(String mt){
        String regex = REGEX;

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(mt);
        return matcher.find();
    }

    public static String ReplaceTheFirstCollonWithFullStop(String mt){
        String regex = REGEX;

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(mt);

        return matcher.replaceAll(".");
    }
}
