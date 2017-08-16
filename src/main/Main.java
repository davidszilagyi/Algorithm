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
    }
}
