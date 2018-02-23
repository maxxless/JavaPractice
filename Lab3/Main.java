package chemicalsupplystore;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void printList(List<Goods> List) {
        for(Goods x: List) {
            System.out.println(x.getGoodsType() + " " + x.price);
        }
    }
    
    public static void main(String[] args) {
        ChemicalSupplyStore Koshyk = new ChemicalSupplyStore();

        Koshyk.addGoods(new AirFresheners(4.2, "Fu", 10.0));
        Koshyk.addGoods(new Liquids(5.3, 5.0, "Fu", 10.0));
        Koshyk.addGoods(new InsectRepellents(4.0, 8.3, 4.0));
        Koshyk.addGoods(new Powders(5.6, "KEK", 10.0, "LOL"));
        Koshyk.addGoods(new ScouringPads(6.6, "D", 5.2, 3.6, "E"));


        System.out.println("\nInitial list of goods:\n");
        printList(Koshyk.getGoodsList());

        
        System.out.println("\nList of searched goods:\n");
        List<Goods> result = Koshyk.findByGroup(GoodsType.LIQUIDS, GoodsColour.WHITE);
        printList(result);
        

        System.out.println("\nSorted list:\n");
        Koshyk.sortByPrice(result);
        printList(result);
    }    

    }
    

