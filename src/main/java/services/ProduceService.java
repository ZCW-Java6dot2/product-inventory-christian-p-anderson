package services;

import models.Produce;
import utils.CSVUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Arrays;

public class ProduceService {

    private static int nextId = 1;


    private final ArrayList<Produce> inventory = new ArrayList<>();


    public Produce create(String name, int qty, float price) {

        Produce createdProduce = new Produce(nextId++, name, qty, price);
        inventory.add(createdProduce);
        return createdProduce;
    }


    public Produce findProduce(int id) {
        for(Produce item : inventory) {
            if(item.getId() == id)  {
                return item;
            }
        }
        return null;
    }


    public Produce[] findAll() {
        Produce[] produceItems = this.inventory.toArray(new Produce[this.inventory.size()]);
        return produceItems;
    }


    public boolean delete(int id) {
        int originalSize = inventory.size();

        for(Produce item : inventory) {
            if(item.getId() == id) {
                int arrListIndex = inventory.indexOf(item);
                inventory.remove(arrListIndex);
            }
        }

        if(originalSize - inventory.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void writeCSV() throws IOException {
        String csvFile = "/Users/christian/Desktop/Produce.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));

        for (Produce p : inventory) {
            ArrayList<String> list = new ArrayList<>();
            list.add(String.valueOf(p.getId()));
            list.add(p.getName());
            list.add(String.valueOf(p.getQty()));
            list.add(String.valueOf(p.getPrice()));

            CSVUtils.writeLine(writer, list);
        }

        writer.flush();
        writer.close();

    }

//    stopped at Section 4 part 2


}


