package challenges;

import java.util.Arrays;

/**
 * Created by David Szilagyi on 2017. 08. 16..
 */
public class Basic {

    public String reverseString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        String reversed = "";
        for (int charAt = chars.length - 1; charAt >= 0; charAt--) {
            reversed += chars[charAt];
        }
        return reversed;
    }

    public long factorialize(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public boolean palindrome(String text) {
        String fixedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9']+", "");
        if (fixedText.equalsIgnoreCase(reverseString(fixedText))) {
            return true;
        }
        return false;
    }

    public int findLongestWord(String text) {
        String[] words = text.split(" ");
        int longest = 0;
        for (int i = 0; i < words.length; i++) {
            if (longest < words[i].length()) {
                longest = words[i].length();
            }
        }
        return longest;
    }

    public String titleCase(String text) {
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return result;
    }

    public long[] largestOfFour(int[][] array) {
        long[] result = new long[array[0].length];
        for (int i = 0; i < array.length; i++) {
            long largest = 0;
            for (int k = 0; k < array[i].length; k++) {
                if (largest < array[i][k]) {
                    largest = array[i][k];
                }
            }
            result[i] = largest;
        }

        return result;
    }

    public boolean confirmEnding(String str, String target) {
        if (reverseString(reverseString(str).toLowerCase()
                .substring(0, target.length())).equalsIgnoreCase(target)) {
            return true;
        }
        return false;
    }

    public String repeatStringNumTimes(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }

    public String truncateString(String str, int num) {
        String result;
        if (num >= str.length()) {
            return str;
        } else if (num <= 3) {
            result = str.substring(0, num) + "...";
        } else {
            result = str.substring(0, num - 3) + "...";
        }
        return result;
    }

    public Object[][] chunkArrayInGroups(Object[] array, int size) {
        int arraySize = (int) Math.ceil(array.length / size);
        int rest = array.length % size;
        int negativeRest = 0;
        if (rest > arraySize) {
            negativeRest = -1;
        }
        Object[][] table = new Object[arraySize + rest + negativeRest][size];
        Object[] restTable = new Object[rest];
        int row = 0;
        int column = 0;
        int object = 0;
        for (int k = 0; k < array.length - rest; k++) {
            table[column][row] = array[object];
            object++;
            row++;
            if (row == size) {
                row = 0;
                column++;
            }
        }

        if (rest != 0) {
            int item = 0;
            for (int y = array.length - rest; y < array.length; y++) {
                restTable[item] = array[y];
                item++;
            }
            table[table.length - 1] = restTable;
        }

        return table;
    }

    public Object[] slasher(Object[] array, int n) {
        String result = "";
        for (int i = n; i < array.length; i++) {
            result += array[i] + ",";
        }
        return result.split(",");
    }

    public Object[] bouncer(Object[] array) {
        Object[] falsy = new Object[]{false, null, 0, "", "undefined", "NaN"};
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (!Arrays.asList(falsy).contains(array[i])) {
                result += array[i] + ",";
            }
        }
        return result.split(",");
    }

    public Object[] destroyer(Object[] array, Object... destroy) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (!Arrays.asList(destroy).contains(array[i])) {
                result += array[i] + ",";
            }
        }
        return result.split(",");
    }

    public int getIndexToIns(int[] numbers, int insert) {
        Arrays.sort(numbers);
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= insert) {
                return index;
            } else {
                index++;
            }
        }
        return index;
    }

    public String rot13(String str) {
        String result = "";
        char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] code = str.toUpperCase().toCharArray();
        for (char character : code) {
            for (int i = 0; i < alphabets.length; i++) {
                if (character == alphabets[i]) {
                    if (i >= 13) {
                        result += alphabets[i - 13];
                        break;
                    } else if (i < 13) {
                        result += alphabets[i + 13];
                        break;
                    }
                } else if (i == alphabets.length - 1) {
                    result += character;
                }
            }
        }
        return result;
    }
}
