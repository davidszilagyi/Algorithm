package main;

import challenges.Basic;

import java.util.Arrays;

/**
 * Created by David Szilagyi on 2017. 08. 16..
 */
public class Main {
    public static void main(String[] args) {
        Basic basic = new Basic();
        System.out.println("-------------------- Reverse a String --------------------");
        System.out.println(basic.reverseString("hello"));
        System.out.println(basic.reverseString("Howdy"));
        System.out.println(basic.reverseString("Greetings from Earth"));
        System.out.println("------------------ Factorialize a number ------------------");
        System.out.println(basic.factorialize(5));
        System.out.println(basic.factorialize(10));
        System.out.println(basic.factorialize(20));
        System.out.println(basic.factorialize(0));
        System.out.println("------------------ Check for palindromes -------------------");
        System.out.println(basic.palindrome("eye"));
        System.out.println(basic.palindrome("_eye"));
        System.out.println(basic.palindrome("race car"));
        System.out.println(basic.palindrome("not a palindrome"));
        System.out.println(basic.palindrome("A man, a plan, a canal. Panama"));
        System.out.println(basic.palindrome("never odd or even"));
        System.out.println(basic.palindrome("nope"));
        System.out.println(basic.palindrome("almostomla"));
        System.out.println(basic.palindrome("My age is 0, 0 si ega ym."));
        System.out.println(basic.palindrome("1 eye for of 1 eye"));
        System.out.println(basic.palindrome("0_0 (: /-\\ :) 0-0"));
        System.out.println(basic.palindrome("five|\\_/|four"));
        System.out.println("------------- Find the Longest Word in a String -------------");
        System.out.println(basic.findLongestWord("The quick brown fox jumped over the lazy dog"));
        System.out.println(basic.findLongestWord("May the force be with you"));
        System.out.println(basic.findLongestWord("Google do a barrel roll"));
        System.out.println(basic.findLongestWord("What is the average airspeed velocity of an unladen swallow"));
        System.out.println(basic.findLongestWord("What if we try a super-long word such as otorhinolaryngology"));
        System.out.println("------------------- Title Case a Sentence --------------------");
        System.out.println(basic.titleCase("I'm a little tea pot"));
        System.out.println(basic.titleCase("sHoRt AnD sToUt"));
        System.out.println(basic.titleCase("HERE IS MY HANDLE HERE IS MY SPOUT"));
        System.out.println("-------------- Return Largest Numbers in Arrays ---------------");
        System.out.println(Arrays.toString(
                basic.largestOfFour(generate4Array(new int[]{4, 5, 1, 3, 13, 27, 18, 26, 32, 35, 37, 39,
                        1000, 1001, 857, 1}))));
        System.out.println(Arrays.toString(basic.largestOfFour(generate4Array(new int[]{4, 9, 1, 3, 13,
                35, 18, 26, 32, 35, 97, 39, 1000000, 1001, 857, 1}))));
        System.out.println("--------------------- Confirm the Ending ----------------------");
        System.out.println(basic.confirmEnding("Bastian", "n"));
        System.out.println(basic.confirmEnding("Connor", "n"));
        System.out.println(basic.confirmEnding("Walking on water and developing software from a specification " +
                "are easy if both are frozen", "specification"));
        System.out.println(basic.confirmEnding("He has to give me a new name", "name"));
        System.out.println(basic.confirmEnding("Open sesame", "same"));
        System.out.println(basic.confirmEnding("Open sesame", "pen"));
        System.out.println(basic.confirmEnding("If you want to save our world, you must hurry. We dont know " +
                "how much longer we can withstand the nothing", "mountain"));
        System.out.println("--------------- Repeat a string repeat a string ----------------");
        System.out.println(basic.repeatStringNumTimes("*", 3));
        System.out.println(basic.repeatStringNumTimes("abc", 3));
        System.out.println(basic.repeatStringNumTimes("abc", 4));
        System.out.println(basic.repeatStringNumTimes("abc", 1));
        System.out.println(basic.repeatStringNumTimes("*", 8));
        System.out.println(basic.repeatStringNumTimes("abc", -2));
        System.out.println("---------------------- Truncate a string -----------------------");
        String test = "A-tisket a-tasket A green and yellow basket";
        System.out.println(basic.truncateString(test, 11));
        System.out.println(basic.truncateString("Peter Piper picked a peck of pickled peppers", 14));
        System.out.println(basic.truncateString(test, test.length()));
        System.out.println(basic.truncateString(test, test.length() + 2));
        System.out.println(basic.truncateString("A-", 1));
        System.out.println(basic.truncateString("Absolutely Longer", 2));
        System.out.println("----------------------- Chuncky Monkey ------------------------");
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{"a", "b", "c", "d"}, 2)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5, 6}, 3)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 4)));
        System.out.println(Arrays.deepToString(basic.chunkArrayInGroups(new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println("----------------------- Slasher Flick ------------------------");
        System.out.println(Arrays.toString(basic.slasher(new Object[]{1, 2, 3}, 2)));
        System.out.println(Arrays.toString(basic.slasher(new Object[]{1, 2, 3}, 0)));
        System.out.println(Arrays.toString(basic.slasher(new Object[]{1, 2, 3}, 9)));
        System.out.println(Arrays.toString(basic.slasher(new Object[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString(basic.slasher(new Object[]{"burgers", "fries", "shake"}, 1)));
        System.out.println(Arrays.toString(basic.slasher(new Object[]{1, 2, "chicken", 3, "potatoes", "cheese", 4}, 5)));
        System.out.println("----------------------- Falsy Bouncer ------------------------");
        System.out.println(Arrays.toString(basic.bouncer(new Object[]{7, "ate", "", false, 9})));
        System.out.println(Arrays.toString(basic.bouncer(new Object[]{"a", "b", "c"})));
        System.out.println(Arrays.toString(basic.bouncer(new Object[]{false, null, 0, "NaN", "undefined", ""})));
        System.out.println(Arrays.toString(basic.bouncer(new Object[]{1, null, "NaN", 2, "undefined"})));
        System.out.println("---------------------- Seek and Destroy -----------------------");
        System.out.println(Arrays.toString(basic.destroyer(new Object[]{1, 2, 3, 1, 2, 3}, 2, 3)));
        System.out.println(Arrays.toString(basic.destroyer(new Object[]{1, 2, 3, 5, 1, 2, 3}, 2, 3)));
        System.out.println(Arrays.toString(basic.destroyer(new Object[]{3, 5, 1, 2, 2}, 2, 3, 5)));
        System.out.println(Arrays.toString(basic.destroyer(new Object[]{2, 3, 2, 3}, 2, 3)));
        System.out.println(Arrays.toString(basic.destroyer(new Object[]{"tree", "hamburger", 53}, "tree", 53)));
        System.out.println("--------------------- Where do I belong ----------------------");
        System.out.println(basic.getIndexToIns(new int[]{10, 20, 30, 40, 50}, 35));
        System.out.println(basic.getIndexToIns(new int[]{10, 20, 30, 40, 50}, 30));
        System.out.println(basic.getIndexToIns(new int[]{40, 60}, 50));
        System.out.println(basic.getIndexToIns(new int[]{3, 10, 5}, 3));
        System.out.println(basic.getIndexToIns(new int[]{5, 3, 20, 3}, 5));
        System.out.println(basic.getIndexToIns(new int[]{2, 20, 10}, 19));
        System.out.println(basic.getIndexToIns(new int[]{2, 5,10}, 15));
        System.out.println("----------------------- Caesars Cipher ------------------------");
        System.out.println(basic.rot13("SERR PBQR PNZC"));
        System.out.println(basic.rot13("SERR CVMMN!"));
        System.out.println(basic.rot13("SERR YBIR?"));
        System.out.println(basic.rot13("GUR DHVPX OEBJA QBT WHZCRQ BIRE GUR YNML SBK."));

    }

    private static int[][] generate4Array(int[] numbers) {
        int[][] generated = new int[4][4];
        int number = 0;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                generated[i][k] = numbers[number];
                number++;
            }
        }
        return generated;
    }
}
