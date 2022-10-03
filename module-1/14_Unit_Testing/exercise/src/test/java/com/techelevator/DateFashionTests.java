package com.techelevator;

public class DateFashionTests {
    @Test
    public void dateFashionTest() {

        DateFashion fashion = new DateFashion();

        assertEquals(2, logic1.dateFashion(5, 10));
        assertEquals(0, logic1.dateFashion(5, 2));
        assertEquals(1, logic1.dateFashion(5, 5));
        assertEquals(0, logic1.dateFashion(10, 2));
    }

}
