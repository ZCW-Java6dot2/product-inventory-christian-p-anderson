package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProduceTest {

    @Test
    public void constructorTest() {
        int expectedId = 6;
        String expectedName = "Cucumber";
        int expectedQty = 3;
        float expectedPrice = 3.52f;

        Produce testProduce = new Produce(expectedId, expectedName, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, testProduce.getId());
        Assertions.assertEquals(expectedName, testProduce.getName());
        Assertions.assertEquals(expectedQty, testProduce.getQty());
        Assertions.assertEquals(expectedPrice, testProduce.getPrice());
    }

    @Test
    public void setIdTest() {
        int expected = 1;

        Produce testProduce = new Produce();
        testProduce.setId(expected);

        Assertions.assertEquals(expected, testProduce.getId());
    }

    @Test
    public void setNameTest() {
        String expected = "banana";

        Produce testProduce = new Produce();
        testProduce.setName(expected);

        Assertions.assertEquals(expected, testProduce.getName());
    }

    @Test
    public void setQtyTest() {
        int expected = 1;

        Produce testProduce = new Produce();
        testProduce.setQty(expected);

        Assertions.assertEquals(expected, testProduce.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = 2;

        Produce testProduce = new Produce();
        testProduce.setPrice(expected);

        Assertions.assertEquals(expected, testProduce.getPrice());
    }
}
