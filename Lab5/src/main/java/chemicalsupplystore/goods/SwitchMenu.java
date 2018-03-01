package chemicalsupplystore.goods;

import chemicalsupplystore.Customer;

import static chemicalsupplystore.Main.printList;

import java.util.List;
import java.util.Scanner;

public class SwitchMenu {

    public static void Menu() {

        Customer Taras = new Customer("Taras", "Gag", 100.5, 10);
        Taras.toString();

        ChemicalSupplyStore Koshyk = new ChemicalSupplyStore("Koshyk", "Lviv", 10, "from 9 to 21");
        Koshyk.toString();

        Koshyk.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, "Fu", 10.0));
        Koshyk.addGoods(new AirFresheners("Persik", 3.2, 15, "Otpad", 11.0));
        Koshyk.addGoods(new AirFresheners("Yabko", 4.0, 10, "Nyam-nyam", 12.0));
        Koshyk.addGoods(new Cleaners("Kitchen", 5.2, 3));
        Koshyk.addGoods(new Cleaners("Floor", 2.2, 7));
        Koshyk.addGoods(new Cleaners("Bathroom", 7.2, 6));
        Koshyk.addGoods(new Cleaners("Polirol'", 4.3, 9));
        Koshyk.addGoods(new LaundryDetergents("Fairy", 5.3, 3, 5.0, 10.0));
        Koshyk.addGoods(new Liquids("Fairy", 5.3, 3, 5.0, "White", 10.0));
        Koshyk.addGoods(new Liquids("Perwoll", 8.3, 7, 4.0, "Pink", 11.0));
        Koshyk.addGoods(new Liquids("Persil", 10.3, 7, 7.0, "Black", 21.0));
        Koshyk.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, 8.3, 4.0));
        Koshyk.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, 3.3, 4.5));
        Koshyk.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, 3.7, 8.5));
        Koshyk.addGoods(new Powders("Calgon", 5.6, 2, "Sodium triphosphate", 10.0, "Multi-coloured"));
        Koshyk.addGoods(new Powders("Tide", 3.6, 4, "Polyphosphoric acid", 10.9, "White"));
        Koshyk.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, 3.6, "Green"));
        Koshyk.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, 4.6, "Yellow"));

        for(int i = 0; i < 10; i++) {
            System.out.println("\n1 - Show Available Goods");
            System.out.println("\n2 - Find Goods");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable goods \n");
                    printList(Koshyk.getGoodsList());

                    System.out.println("\n1 - Sort by price \n");

                    int choice1 = scanner.nextInt();

                    switch (choice1) {
                        case 1:
                            System.out.println("\nSorted list:\n");
                            List<Goods> result = Koshyk.getGoodsList();
                            Koshyk.sortByPrice(result);
                            printList(result);
                    }
                    break;
                case 2:
                    System.out.println("\nSearch by:");
                    System.out.println("\n1 - Type:");
                    System.out.println("\n2 - Colour:");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("\n 1 - AirFresheners:");
                            System.out.println("\n 2 - Cleaners:");
                            System.out.println("\n 3 - InsectRepellents:");
                            System.out.println("\n 4 - LaundryDetergents:");
                            System.out.println("\n 5 - Liquids:");
                            System.out.println("\n 6 - Powders:");
                            System.out.println("\n 7 - Scouring Pads:");

                            int choice21 = scanner.nextInt();
                            switch (choice21) {
                                case 1:
                                    System.out.println("\nAirFresheners:\n");
                                    List<Goods> result1 = Koshyk.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
                                    printList(result1);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceA = scanner.nextInt();
                                    switch (choiceA) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result1);
                                            printList(result1);
                                            break;
                                    }
                                    break;

                                case 2:
                                    System.out.println("\nCleaners:\n");
                                    List<Goods> result2 = Koshyk.findByGroup(GoodsType.CLEANERS, GoodsColour.NONE);
                                    printList(result2);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceB = scanner.nextInt();
                                    switch (choiceB) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result2);
                                            printList(result2);
                                            break;
                                    }
                                    break;

                                case 3:
                                    System.out.println("\nInsectRepellents:\n");
                                    List<Goods> result3 = Koshyk.findByGroup(GoodsType.INSECT_REPELLENTS, GoodsColour.NONE);
                                    printList(result3);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceC = scanner.nextInt();
                                    switch (choiceC) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result3);
                                            printList(result3);
                                            break;
                                    }
                                    break;

                                case 4:
                                    System.out.println("\nLaundryDetergents:\n");
                                    List<Goods> result4 = Koshyk.findByGroup(GoodsType.LAUNDRY_DETERGENTS, GoodsColour.NONE);
                                    printList(result4);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceD = scanner.nextInt();
                                    switch (choiceD) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result4);
                                            printList(result4);
                                            break;
                                    }
                                    break;

                                case 5:
                                    System.out.println("\nLiquids:\n");
                                    List<Goods> result5 = Koshyk.findByGroup(GoodsType.LIQUIDS, GoodsColour.NONE);
                                    printList(result5);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceE = scanner.nextInt();
                                    switch (choiceE) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result5);
                                            printList(result5);
                                            break;
                                    }
                                    break;

                                case 6:
                                    System.out.println("\nPowders:\n");
                                    List<Goods> result6 = Koshyk.findByGroup(GoodsType.POWDERS, GoodsColour.NONE);
                                    printList(result6);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceF = scanner.nextInt();
                                    switch (choiceF) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result6);
                                            printList(result6);
                                            break;
                                    }
                                    break;
                                case 7:
                                    System.out.println("\nScouringPads:\n");
                                    List<Goods> result7 = Koshyk.findByGroup(GoodsType.SCOURING_PADS, GoodsColour.NONE);
                                    printList(result7);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceG = scanner.nextInt();
                                    switch (choiceG) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result7);
                                            printList(result7);
                                            break;
                                    }
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("\nColour:\n");
                            System.out.println("\n 1 - White:");
                            System.out.println("\n 2 - Blue:");
                            System.out.println("\n 3 - Black:");
                            System.out.println("\n 4 - Yellow:");
                            System.out.println("\n 5 - Red:");
                            int choice3 = scanner.nextInt();
                            switch (choice3) {
                                case 1:
                                    System.out.println("\nWhite:\n");
                                    List<Goods> result1 = Koshyk.findByGroup(GoodsType.NONE, GoodsColour.WHITE);
                                    printList(result1);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceH = scanner.nextInt();
                                    switch (choiceH) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result1);
                                            printList(result1);
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("\nBlue:\n");
                                    List<Goods> result2 = Koshyk.findByGroup(GoodsType.NONE, GoodsColour.BLUE);
                                    printList(result2);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceI = scanner.nextInt();
                                    switch (choiceI) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result2);
                                            printList(result2);
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("\nBlack:\n");
                                    List<Goods> result3 = Koshyk.findByGroup(GoodsType.NONE, GoodsColour.BLACK);
                                    printList(result3);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceJ = scanner.nextInt();
                                    switch (choiceJ) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result3);
                                            printList(result3);
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.println("\nYellow:\n");
                                    List<Goods> result4 = Koshyk.findByGroup(GoodsType.NONE, GoodsColour.YELLOW);
                                    printList(result4);
                                    System.out.println("\n1 - Sort by price \n");
                                    int choiceK = scanner.nextInt();
                                    switch (choiceK) {
                                        case 1:
                                            System.out.println("\nSorted list:\n");
                                            Koshyk.sortByPrice(result4);
                                            printList(result4);
                                            break;
                                    }
                                    break;
                                case 5:
                                    System.out.println("\nRed:\n");
                                    List<Goods> result5 = Koshyk.findByGroup(GoodsType.NONE, GoodsColour.RED);
                                    printList(result5);
                                    break;
                            }
                            break;

                        default:
                            break;
                    }
            }
        }
    }

}
