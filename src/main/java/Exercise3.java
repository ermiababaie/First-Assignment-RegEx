import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {



    public static String extractURL(String text) {

        String regex = "http[s]*://[a-z]*[A-Z]*[-.]*[a-z]*[A-Z]*[-.]*[a-z]*[A-Z]*[-.]*[a-z]*[A-Z]*[-.]*";  // TODO
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
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            String save;
            int j = i;
            while (j < input.length() && input.charAt(j) != ' ') {
                j++;
            }
            save = input.substring(i, j);
            i = j;
            int cnt = 0;
            j = 0;
            for (; j < save.length(); j++) {
                for (int k = 0; k < save.length(); k++) {
                    if (save.charAt(j) == save.charAt(k))
                        cnt++;
                }
            }
            if (cnt > 0)
                wordsWithRepeatLetters.add(save);
        }
        return wordsWithRepeatLetters;
        // TODO
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
