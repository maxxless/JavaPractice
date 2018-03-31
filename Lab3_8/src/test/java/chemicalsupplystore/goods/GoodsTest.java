package chemicalsupplystore.goods;

import chemicalsupplystore.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.util.List;

import static chemicalsupplystore.goods.ChemicalSupplyStore.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class GoodsTest {
    Goods goods;

    @BeforeEach
    void init() {
        Customer taras = new Customer("Taras", "Gag", 100.5, 10);
        taras.toString();

        ChemicalSupplyStore koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");

        koshyk.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Fu", 10.0));
        koshyk.addGoods(new AirFresheners("Persik", 3.2, 15, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Otpad", 11.0));
        koshyk.addGoods(new AirFresheners("Yabko", 4.0, 10, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Nyam-nyam", 12.0));
        koshyk.addGoods(new Cleaners("Kitchen", 5.2, 3, GoodsColour.BLUE, GoodsType.CLEANERS));
        koshyk.addGoods(new Cleaners("Floor", 2.2, 7, GoodsColour.BLUE, GoodsType.CLEANERS));
        koshyk.addGoods(new Cleaners("Bathroom", 7.2, 6, GoodsColour.BLUE, GoodsType.CLEANERS));
        koshyk.addGoods(new Cleaners("Polirol'", 4.3, 9, GoodsColour.BLUE, GoodsType.CLEANERS));
        koshyk.addGoods(new LaundryDetergents("Fairy", 5.3, 3, GoodsColour.BROWN, GoodsType.LAUNDRY_DETERGENTS, 5.0, 10.0));
        koshyk.addGoods(new Liquids("Fairy", 5.3, 3, GoodsColour.BLUE, GoodsType.LIQUIDS, 5.0, "White", 10.0));
        koshyk.addGoods(new Liquids("Perwoll", 8.3, 7, GoodsColour.BLUE, GoodsType.LIQUIDS, 4.0, "Pink", 11.0));
        koshyk.addGoods(new Liquids("Persil", 10.3, 7, GoodsColour.BLUE, GoodsType.LIQUIDS, 7.0, "Black", 21.0));
        koshyk.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 8.3, 4.0));
        koshyk.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 3.3, 4.5));
        koshyk.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 3.7, 8.5));
        koshyk.addGoods(new Powders("Calgon", 5.6, 2, GoodsColour.BLUE, GoodsType.POWDERS, "Sodium triphosphate", 10.0, "Multi-coloured"));
        koshyk.addGoods(new Powders("Tide", 3.6, 4, GoodsColour.BLUE, GoodsType.POWDERS, "Polyphosphoric acid", 10.9, "White"));
        koshyk.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, GoodsColour.GREEN, GoodsType.SCOURING_PADS, 3.6, "Green"));
        koshyk.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, GoodsColour.GREEN, GoodsType.SCOURING_PADS, 4.6, "Yellow"));

        System.out.println("\nAvailable goods \n");
        printList(koshyk.getGoodsList());

        System.out.println("\nAirFresheners:\n");
        List<Goods> result1 = koshyk.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
        printList(result1);

        System.out.println("\nSorted list:\n");
        koshyk.sortByPrice(result1);
        printList(result1);
    }

    @Test
    public void testGetterGoodsWithValidName() {
        goods.setName("Home");
        final String result = goods.getName();
        assertEquals("Home", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidName() {
        String name = "Home";
        goods.setName(name);
        assertEquals("Home", goods.getName(), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Name")
    @Test
    public void testSetterGoodsWithInvalidName() {
        String name = "";
        assertThrows(IllegalArgumentException.class, () -> {
            goods.setName(name);
        });
    }

    @Test
    public void testGetterGoodsWithValidPrice() {
        goods.setPrice(5.0);
        final double result = goods.getPrice();
        assertEquals(5.0, result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidPrice() {
        double price = 5.0;
        goods.setPrice(price);
        assertEquals(5.0, goods.getPrice(), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Price")
    @Test
    public void testSetterGoodsWithInvalidPrice() {
        double price = -5.0;
        assertThrows(IllegalArgumentException.class, () -> {
            goods.setPrice(price);
        });
    }

    @Test
    public void testGetterGoodsWithValidAmount() {
        goods.setAmount(5);
        final double result = goods.getAmount();
        assertEquals(5, result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidAmount() {
        int amount = 5;
        goods.setAmount(amount);
        assertEquals(5, goods.getAmount(), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Amount")
    @Test
    public void testSetterGoodsWithInvalidAmount() {
        int amount = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            goods.setAmount(amount);
        });
    }
}
