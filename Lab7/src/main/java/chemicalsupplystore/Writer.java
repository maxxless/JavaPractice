package chemicalsupplystore;

import chemicalsupplystore.goods.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    public static void writeToFile(final List<Goods> goodsList) throws IOException {
        FileWriter writer = new FileWriter("D:\\NETBEANS\\Projects\\ChemicalStore/list.csv");


        ChemicalSupplyStore koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");

        koshyk.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, "Fu", 10.0));
        koshyk.addGoods(new AirFresheners("Persik", 3.2, 15, "Otpad", 11.0));
        koshyk.addGoods(new AirFresheners("Yabko", 4.0, 10, "Nyam-nyam", 12.0));
        koshyk.addGoods(new Cleaners("Kitchen", 5.2, 3));
        koshyk.addGoods(new Cleaners("Floor", 2.2, 7));
        koshyk.addGoods(new Cleaners("Bathroom", 7.2, 6));
        koshyk.addGoods(new Cleaners("Polirol'", 4.3, 9));
        koshyk.addGoods(new LaundryDetergents("Fairy", 5.3, 3, 5.0, 10.0));
        koshyk.addGoods(new Liquids("Fairy", 5.3, 3, 5.0, "White", 10.0));
        koshyk.addGoods(new Liquids("Perwoll", 8.3, 7, 4.0, "Pink", 11.0));
        koshyk.addGoods(new Liquids("Persil", 10.3, 7, 7.0, "Black", 21.0));
        koshyk.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, 8.3, 4.0));
        koshyk.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, 3.3, 4.5));
        koshyk.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, 3.7, 8.5));
        koshyk.addGoods(new Powders("Calgon", 5.6, 2, "Sodium triphosphate", 10.0, "Multi-coloured"));
        koshyk.addGoods(new Powders("Tide", 3.6, 4, "Polyphosphoric acid", 10.9, "White"));
        koshyk.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, 3.6, "Green"));
        koshyk.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, 4.6, "Yellow"));

        goodsList.forEach((Goods x) -> {
            try {
                writer.write(x.getHeaders());
                writer.write("\n");
                writer.write(x.toCVS());
                writer.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();

    }
}
