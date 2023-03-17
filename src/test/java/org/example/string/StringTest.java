package org.example.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    String a = "abcde";
    String b = null;
    String c = "";

    @Test
    void length(){
        assertEquals(5, a.length());
        assertNotEquals(0, "coffee".length());
        assertEquals(0, "".length());
        assertEquals(4, "mint".length());
    }


    @Test
    void isEmpty(){
        assertEquals(false, a.isEmpty());
        assertTrue(c.isEmpty());

    }


    @Test
    void charAt() throws Exception{
        assertNotNull(a);
        assertTrue(a.charAt(4) == 'e');
        boolean condition = false;
        try{
            b.charAt(0);
        }
        catch(NullPointerException e){
            condition= true;
        }
        assertTrue(condition);
    }


    @Test
    void indexOf(){
        assertFalse(2 == c.indexOf('c'));
        assertTrue(2 == a.indexOf('c'));

    }

}
