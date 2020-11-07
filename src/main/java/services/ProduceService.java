package services;

import models.Produce;
import java.util.ArrayList;

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
        return (Produce[]) this.inventory.toArray();
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

}
