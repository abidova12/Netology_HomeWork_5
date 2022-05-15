package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testAllRight() {
        SQRService service = new SQRService();
        int actual = service.numerical(100, 196);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinus() {
        SQRService service = new SQRService();
        int actual = service.numerical(101, 195);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlus() {
        SQRService service = new SQRService();
        int actual = service.numerical(99, 197);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
