package org.example.methods_recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTwoTest {
    HomeworkTwo obj = new HomeworkTwo();

    @Test
    void number1() {
        assertEquals(obj.number1(1, 2), 0);
        assertFalse(obj.number1(1, 2)==1);
    }

    @Test
    void number4() {
        char a = 'a';
        assertTrue(obj.number4(a) == 'a');
    }

    @Test
    void number5() {
        assertEquals(obj.number5(1.2f, 5.565f), 1.2f);
        assertFalse(obj.number5(1.2f, 5.565f) == 5.565f);
    }

    @Test
    void number6() {
        assertEquals(obj.number6(), 4);
        assertFalse(obj.number6() == 5);
    }
}