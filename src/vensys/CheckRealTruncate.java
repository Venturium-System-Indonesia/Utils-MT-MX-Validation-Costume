package vensys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRealTruncate {

    public static boolean IsRealTruncate(String mt){
        String regex1 = "^:.{0,3}:.{34}\\+\\n(?!:)";
        String regex2 = "^(?!:).{34}\\+\\n:";
        String regex3 = "^(?!:).{34}\\+\\n(?!:)";
        String regex4 = "^:.{0,3}:.{15}\\+\\n:";

        // just in case system readn \r\n rather than \n
        String regex5 = "^:.{0,3}:.{34}\\+\\r\\n(?!:)";
        String regex6 = "^(?!:).{34}\\+\\r\\n:";
        String regex7 = "^(?!:).{34}\\+\\r\\n(?!:)";
        String regex8 = "^:.{0,3}:.{15}\\+\\r\\n:";

        String allRegex = regex1+"|"+regex2+"|"+regex3+"|"+regex4+"|"+regex5+"|"+regex6+"|"+regex7+"|"+regex8;

//        System.out.println(allRegex);

        Pattern pattern = Pattern.compile(allRegex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(mt);
        return matcher.find();

    }




    public static String IsRealTruncateOnString(String mt){
        System.out.println("|");
        if (IsRealTruncate(mt)){
            return "Truncate";
        }
        else {
            return  "Not Truncate";
        }
    }
}
