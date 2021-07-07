package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JuiceTest {

    @Test
    public void constructorTest() {
        int expectedId = 6;
        String expectedName = "Pineapple";
        String expectedBrand = "Del Monte";
        int expectedQty = 1;
        float expectedPrice = 6.56f;

        Juice testJuice = new Juice(expectedId, expectedName, expectedBrand, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, testJuice.getId());
        Assertions.assertEquals(expectedName, testJuice.getName());
        Assertions.assertEquals(expectedBrand, testJuice.getBrand());
        Assertions.assertEquals(expectedQty, testJuice.getQty());
        Assertions.assertEquals(expectedPrice, testJuice.getPrice());
    }

    @Test
    public void setIdTest() {
        int expected = 1;

        Juice testJuice = new Juice();
        testJuice.setId(expected);

        Assertions.assertEquals(expected, testJuice.getId());
    }

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
        float expected = 3.00f;

        Juice testJuice = new Juice();
        testJuice.setPrice(expected);

        Assertions.assertEquals(expected, testJuice.getPrice());
    }
}
