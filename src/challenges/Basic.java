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

    public String titleCase(String text) {
        String[] words = text.split(" ");
        String result = "";
        for(String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return result;
    }

    public String largestOfFour(int[][] array) {
        long[] result = new long[array[0].length];
        for(int i = 0; i < array.length; i++) {
            long largest = 0;
            for(int k = 0; k < array[i].length; k++) {
                if(largest < array[i][k]) {
                    largest = array[i][k];
                }
            }
            result[i] = largest;
        }
        String resultText = "[";
        for(int i = 0; i < result.length; i++) {
            resultText += result[i];
            if(i != 3) {
                resultText += ",";
            }
        }
        return resultText += "]";
    }

    public boolean confirmEnding(String str, String target) {
        if(reverseString(reverseString(str).toLowerCase()
                .substring(0, target.length())).equalsIgnoreCase(target)) {
            return true;
        }
        return false;
    }

    public String repeatStringNumTimes(String str, int num) {
        String result = "";
        for(int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }

    public String truncateString(String str, int num) {
        String result;
        if(num >= str.length()) {
            return str;
        } else if(num <= 3) {
            result = str.substring(0, num) + "...";
        } else {
            result = str.substring(0, num - 3) + "...";
        }
        return result;
    }
}
