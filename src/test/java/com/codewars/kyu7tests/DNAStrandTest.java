package com.codewars.kyu7tests;

import com.codewars.kyu7.DnaStrand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by robb on 15/05/2017.
 */
public class DNAStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
