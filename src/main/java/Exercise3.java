import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {



    public static String extractURL(String text) {

        String regex = "(https?)://[a-zA-Z0-9-]*[.]?\\w*[.]\\w{2,3}";  // TODO
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "\\.";  // TODO
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            return true;
        }
        else{
            return false;
        }
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        String regex = "\\b\\w*?([a-z])\\w*?\\1\\w*?\\b";  // TODO
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);    
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }
    
        return wordsWithRepeatLetters;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {
    }
}
