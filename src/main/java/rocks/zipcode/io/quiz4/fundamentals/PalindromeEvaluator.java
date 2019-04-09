package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        // make a set
        Set<String> result = new HashSet<>();
        // im going to need to make two four loops
        for (int i = 0; i <= string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if (isPalindrome(string.substring(i, j + 1))) {
                    result.add(string.substring(i, j + 1));
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        Boolean result = false;
        if (string.equals(reverseString(string)))
            result = true;
        return result;
    }

    public static String reverseString(String string) {
        StringBuilder strB = new StringBuilder(string);
        return strB.reverse().toString();
    }
}
