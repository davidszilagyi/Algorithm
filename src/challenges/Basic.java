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
}