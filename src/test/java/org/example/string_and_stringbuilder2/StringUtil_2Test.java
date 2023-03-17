package org.example.string_and_stringbuilder2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtil_2Test {
    StringUtil_2 str = new StringUtil_2();

    @Test
    void subString2Chars() {
        String a = "aaa";
        String b = "ozozozakkk";
        String k = "okkkkkzozo";
        String l = "pzooozozo";
        assertEquals("", str.subString2Chars(a));
        assertTrue("oz" ==str.subString2Chars(b));
        assertFalse("oz" == str.subString2Chars(k));
        assertTrue("o" == str.subString2Chars(k));
        assertTrue("z" == str.subString2Chars(l));
    }

    @Test
    void containsXX() {

        String a = "xxxxxxxxx";
        String aa = "axx";
        String aaa = "axxxaxxxaxxxx";
        String aaaa = "axaxaxkxjx";
        assertEquals(8,str.containsXX(a));
        assertEquals(1,str.containsXX(aa));
        assertEquals(7,str.containsXX(aaa));
        assertEquals(0,str.containsXX(aaaa));
    }

    @Test
    void isPalindrome() {
        assertEquals(true, str.isPalindrome("abcba"));
        assertEquals(false, str.isPalindrome("notes"));
    }
}