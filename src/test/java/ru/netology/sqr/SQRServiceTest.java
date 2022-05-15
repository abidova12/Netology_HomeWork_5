package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();
        int actual = service.numerical(1_000, 10_000);
        int expected = 68;

        Assertions.assertEquals(expected, actual);
    }
}
