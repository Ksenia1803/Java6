package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void Method1() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.searchForSqr(200, 300);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "=" + expected);

    }

    @Test
    public void Method2() {
        SqrService service = new SqrService();
        int expected = 6;
        int actual = service.searchForSqr(100, 250);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "=" + expected);

    }

    @Test
    public void Method3() {
        SqrService service = new SqrService();
        int expected = 0;
        int actual = service.searchForSqr(20, 50);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "=" + expected);
    }


}
