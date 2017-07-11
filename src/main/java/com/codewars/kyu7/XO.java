package com.codewars.kyu7;

/**
 * Created by robb on 15/05/2017.
 */
public class XO {
    public static boolean getXO(String str) {
        str = str.toLowerCase();

        int xCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                xCounter++;
            }
        }

        int oCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                oCounter++;
            }
        }

        if (xCounter == oCounter) {
            return true;
        } else {
            return false;
        }
    }
}
