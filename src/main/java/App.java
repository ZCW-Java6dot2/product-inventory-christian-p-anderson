import io.Console;
import models.Produce;
import services.ProduceService;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

    private ProduceService produceService = new ProduceService();
    private Produce produce = new Produce();

    Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        Console.printWelcome();
        boolean keepOn = true;
        int menuInput = 0;

        int idInput = 0;
        String nameInput = "";
        int qtyInput = 0;
        float priceInput = 0.00f;
        int lastId = 0;

        while (keepOn) {

            Console.println("Produce Inventory Management Options"
                    + "\n1: Add produce to inventory"
                    + "\n2: Remove produce from inventory"
                    + "\n3: Get a list of all items from inventory *** currently broken ***"
                    + "\n4: Close application");

            menuInput = Console.getIntegerInput("Please make your selection: ");

            try {
                switch (menuInput) {

                    case 1:
                        nameInput = Console.getStringInput("Enter the name of the produce item: ");
                        qtyInput = Console.getIntegerInput("Enter the quantity of the produce item: ");
                        priceInput = Console.getFloatInput("Enter the price per each produce item: ");

                        produceService.create(nameInput, qtyInput, priceInput);

                        break;

                    case 2:
                        idInput = Console.getIntegerInput("Enter the produce id of the item you want to remove from inventory: ");

                        produceService.delete(idInput);

                        break;

                    case 3:
                        System.out.println("Here is a list of all your items in the produce inventory database");

                        Produce[] all = produceService.findAll();

                        System.out.print(all);

                    case 4:
                        keepOn = false;
                        System.out.println("Exiting inventory management application");
                }
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("\n Invalid selection. Please choose again.");
            }


        }









    }




}
