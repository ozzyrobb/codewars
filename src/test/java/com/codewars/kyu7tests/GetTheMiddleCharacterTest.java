package com.codewars.kyu7tests;

import com.codewars.kyu7.GetTheMiddleCharacter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by robb on 12/09/2017.
 */
public class GetTheMiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
        assertEquals("aa", GetTheMiddleCharacter.getMiddle("aa"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
        assertEquals("B", GetTheMiddleCharacter.getMiddle("B"));
    }
}
