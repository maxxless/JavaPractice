package chemicalsupplystore.goods;

import static chemicalsupplystore.goods.ChemicalSupplyStore.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import chemicalsupplystore.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.List;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class PowdersTest {
    private Powders powders;

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
    public void testGetterPowdersWithValidColour() throws NoSuchFieldException, IllegalAccessException {
        final Field field = powders.getClass().getDeclaredField("colour");
        field.setAccessible(true);
        field.set(powders, "Red");
        final String result = powders.getColour();
        assertEquals("Red", result, "Fields don't match");
    }

    @Test
    public void testSetterPowdersWithValidColour() throws NoSuchFieldException, IllegalAccessException {
        String colour = "Red";
        powders.setColour(colour);
        final Field field = powders.getClass().getDeclaredField("colour");
        field.setAccessible(true);
        assertEquals("Red", field.get(powders), "Fields don't match");
    }

    @DisplayName("Test Powders With Invalid Colour")
    @Test
    public void testSetterPowdersWithInvalidColour() {
        String colour = "";
        assertThrows(IllegalArgumentException.class, () -> {
            powders.setColour(colour);
        });
    }

    @Test
    public void testGetterPowdersWithValidMaterial() throws NoSuchFieldException, IllegalAccessException {
        final Field field = powders.getClass().getDeclaredField("material");
        field.setAccessible(true);
        field.set(powders, "Plastic");
        final String result = powders.getMaterial();
        assertEquals("Plastic", result, "Fields don't match");
    }

    @Test
    public void testSetterPowdersWithValidMaterial() throws NoSuchFieldException, IllegalAccessException {
        String material = "Plastic";
        powders.setMaterial(material);
        final Field field = powders.getClass().getDeclaredField("material");
        field.setAccessible(true);
        assertEquals("Plastic", field.get(powders), "Fields don't match");
    }

    @DisplayName("Test Powders With Invalid Material")
    @Test
    public void testSetterPowdersWithInvalidMaterial() {
        String material = "";
        assertThrows(IllegalArgumentException.class, () -> {
            powders.setMaterial(material);
        });
    }

    @Test
    public void testGetterPowdersWithValidWeight() throws NoSuchFieldException, IllegalAccessException {
        final Field field = powders.getClass().getDeclaredField("weight");
        field.setAccessible(true);
        field.set(powders, 10.5);
        final double result = powders.getWeight();
        assertEquals(10.5, result, "Fields don't match");
    }

    @Test
    public void testSetterPowdersWithValidWeight() throws NoSuchFieldException, IllegalAccessException {
        double weight = 10.5;
        powders.setWeight(weight);
        final Field field = powders.getClass().getDeclaredField("weight");
        field.setAccessible(true);
        assertEquals(10.5, field.get(powders), "Fields don't match");
    }

    @DisplayName("Test Powders With Invalid Weight")
    @Test
    public void testSetterPowdersWithInvalidWeight() {
        double weight = -100.0;
        assertThrows(IllegalArgumentException.class, () -> {
            powders.setWeight(weight);
        });
    }

    @Test
    public void testGetterPowdersWithValidGoodsType() throws NoSuchFieldException, IllegalAccessException {
        final Field field = powders.getClass().getDeclaredField("goodsType");
        field.setAccessible(true);
        field.set(powders, GoodsType.POWDERS);
        final GoodsType result = powders.getGoodsType();
        assertEquals(GoodsType.POWDERS, result, "Fields don't match");
    }

    @Test
    public void testGetterPowdersWithValidGoodsColour() throws NoSuchFieldException, IllegalAccessException {
        final Field field = powders.getClass().getDeclaredField("goodsColour");
        field.setAccessible(true);
        field.set(powders, GoodsColour.BLACK);
        final GoodsColour result = powders.getGoodsColour();
        assertEquals(GoodsColour.BLACK, result, "Fields don't match");
    }

    @Test
    public final void testToString() {
        assertFalse(powders.toString().contains("@"));
    }

    @AfterEach
    void tearDown() {
        powders = null;
    }
}
