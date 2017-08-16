package challenges;

/**
 * Created by David Szilagyi on 2017. 08. 16..
 */
public class Basic {

    public String reverseString(String text) {
        char[] chars = new char[text.length()];
        for(int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        String reversed = "";
        for(int charAt = chars.length - 1; charAt >= 0; charAt--) {
            reversed += chars[charAt];
        }
        return reversed;
    }

    public long factorialize(int number) {
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public boolean palindrome(String text) {
        String fixedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9']+", "");
        if(fixedText.equalsIgnoreCase(reverseString(fixedText))) {
            return true;
        }
        return false;
    }

    public int findLongestWord(String text) {
        String[] words = text.split(" ");
        int longest = 0;
        for(int i = 0; i < words.length; i++) {
            if(longest < words[i].length()) {
                longest = words[i].length();
            }
        }
        return longest;
    }
}
