package main;

import challenges.Basic;

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
        System.out.println("------------------ Check for palindromes ------------------");
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
        System.out.println("------------------ Find the Longest Word in a String ------------------");
        System.out.println(basic.findLongestWord("The quick brown fox jumped over the lazy dog"));
        System.out.println(basic.findLongestWord("May the force be with you"));
        System.out.println(basic.findLongestWord("Google do a barrel roll"));
        System.out.println(basic.findLongestWord("What is the average airspeed velocity of an unladen swallow"));
        System.out.println(basic.findLongestWord("What if we try a super-long word such as otorhinolaryngology"));
    }
}
