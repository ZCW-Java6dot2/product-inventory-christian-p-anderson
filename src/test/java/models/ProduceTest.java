package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProduceTest {

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
