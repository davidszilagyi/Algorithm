package main;

import challenges.Basic;

/**
 * Created by David Szilagyi on 2017. 08. 16..
 */
public class Main {
    public static void main(String[] args) {
        Basic basic = new Basic();
        System.out.println(basic.reverseString("hello"));
        System.out.println(basic.reverseString("Howdy"));
        System.out.println(basic.reverseString("Greetings from Earth"));
    }
}
