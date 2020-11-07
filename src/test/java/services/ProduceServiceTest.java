package services;

import models.Produce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ProduceServiceTest {

    @Test
    public void createTest() {
        String expectedName = "bananas";
        int expectedQty = 2;
        float expectedPrice = 3.25f;

        ProduceService produceService = new ProduceService();
        Produce testProduce = produceService.create(expectedName, expectedQty, expectedPrice);

        int actualId = testProduce.getId();
        String actualName = testProduce.getName();
        int actualQty = testProduce.getQty();
        float actualPrice = testProduce.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findProduce() {
        int expectedId = 1;
        String expectedName = "grapefruit";
        int expectedQty = 2;
        float expectedPrice = 3.00f;

        ProduceService testFindProduce = new ProduceService();
        Produce testProduce = testFindProduce.create(expectedName, expectedQty, expectedPrice);
        Produce actualResults = testFindProduce.findProduce(expectedId);
        Produce expectedResults = testProduce;
        Assertions.assertEquals(expectedResults, actualResults);
    }

    @Test
    public void findAll() {
        ArrayList<Produce> testInventory = new ArrayList<>();
        ProduceService testObj = new ProduceService();

        Produce lettuceObj = testObj.create("lettuce", 3, 2.00f);
        Produce onionObj = testObj.create("onions", 4, 3.50f);
        Produce bananaObj = testObj.create("bananas", 2, 1.35f);

        testInventory.add(lettuceObj);
        testInventory.add(onionObj);
        testInventory.add(bananaObj);

//        Produce[] expected = (Produce[]) testInventory.toArray();
        Produce[] expected = testInventory.toArray(new Produce[0]);
        Produce[] actual = testObj.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void delete() {

        ProduceService testObjDelete = new ProduceService();

        testObjDelete.create("lettuce", 3, 2.00f);
        testObjDelete.create("onions", 4, 3.50f);
        testObjDelete.create("bananas", 2, 1.35f);

        boolean actual = testObjDelete.delete(2);

        Assertions.assertTrue(actual);
    }
}
