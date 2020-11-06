package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JuiceTest {

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Juice testJuice = new Juice();
        testJuice.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testJuice.getName());
    }

    @Test
    public void setBrandTest() {
        String expected = "DelMonte";

        Juice testJuice = new Juice();
        testJuice.setBrand(expected);

        Assertions.assertEquals(expected, testJuice.getBrand());
    }

    @Test
    public void setQtyTest() {
        int expected = 2;

        Juice testJuice = new Juice();
        testJuice.setQty(expected);

        Assertions.assertEquals(expected, testJuice.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = 3;

        Juice testJuice = new Juice();
        testJuice.setPrice(expected);

        Assertions.assertEquals(expected, testJuice.getPrice());
    }
}
