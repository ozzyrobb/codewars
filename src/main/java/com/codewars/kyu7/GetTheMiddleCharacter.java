package com.codewars.kyu7;

/**
 * Created by robb on 12/09/2017.
 */
public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        while (word.length() > 2) {
            word = word.substring(1, word.length() - 1);
        }
        return word;
    }
}
