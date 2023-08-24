package org.example;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void whenIntIs0_thenReturnInt0() {

        //GIVEN
        int a = 0;
        //WHEN
        int actual = Main.fibonacci(a);
        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void whenIntIs5_thenReturnInt5() {

        //GIVEN
        int a = 5;
        //WHEN
        int actual = Main.fibonacci(a);
        //THEN
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenIntIs15_thenReturnInt610() {

        //GIVEN
        int a = 15;
        //WHEN
        int actual = Main.fibonacci(a);
        //THEN
        int expected = 610;
        Assertions.assertEquals(expected, actual);
    }
}