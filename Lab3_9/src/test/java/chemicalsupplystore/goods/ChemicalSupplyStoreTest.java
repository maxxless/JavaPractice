package chemicalsupplystore.goods;

import static chemicalsupplystore.goods.ChemicalSupplyStore.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

import chemicalsupplystore.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class ChemicalSupplyStoreTest {
    private ChemicalSupplyStore chemicalSupplyStore;

    @BeforeEach
    void init() {

        chemicalSupplyStore = new ChemicalSupplyStore("Epicenter", "Lviv", 5, "from 9 to 15");
        Customer taras = new Customer("Taras", "Gag", 100.5, 10);
        taras.toString();
        

        chemicalSupplyStore.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Fu", 10.0));
        chemicalSupplyStore.addGoods(new AirFresheners("Persik", 3.2, 15, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Otpad", 11.0));
        chemicalSupplyStore.addGoods(new AirFresheners("Yabko", 4.0, 10, GoodsColour.BLACK, GoodsType.AIR_FRESHENERS, "Nyam-nyam", 12.0));
        chemicalSupplyStore.addGoods(new Cleaners("Kitchen", 5.2, 3, GoodsColour.BLUE, GoodsType.CLEANERS));
        chemicalSupplyStore.addGoods(new Cleaners("Floor", 2.2, 7, GoodsColour.BLUE, GoodsType.CLEANERS));
        chemicalSupplyStore.addGoods(new Cleaners("Bathroom", 7.2, 6, GoodsColour.BLUE, GoodsType.CLEANERS));
        chemicalSupplyStore.addGoods(new Cleaners("Polirol'", 4.3, 9, GoodsColour.BLUE, GoodsType.CLEANERS));
        chemicalSupplyStore.addGoods(new LaundryDetergents("Fairy", 5.3, 3, GoodsColour.BROWN, GoodsType.LAUNDRY_DETERGENTS, 5.0, 10.0));
        chemicalSupplyStore.addGoods(new Liquids("Fairy", 5.3, 3, GoodsColour.BLUE, GoodsType.LIQUIDS, 5.0, "White", 10.0));
        chemicalSupplyStore.addGoods(new Liquids("Perwoll", 8.3, 7, GoodsColour.BLUE, GoodsType.LIQUIDS, 4.0, "Pink", 11.0));
        chemicalSupplyStore.addGoods(new Liquids("Persil", 10.3, 7, GoodsColour.BLUE, GoodsType.LIQUIDS, 7.0, "Black", 21.0));
        chemicalSupplyStore.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 8.3, 4.0));
        chemicalSupplyStore.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 3.3, 4.5));
        chemicalSupplyStore.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, GoodsColour.BLUE, GoodsType.INSECT_REPELLENTS, 3.7, 8.5));
        chemicalSupplyStore.addGoods(new Powders("Calgon", 5.6, 2, GoodsColour.BLUE, GoodsType.POWDERS, "Sodium triphosphate", 10.0, "Multi-coloured"));
        chemicalSupplyStore.addGoods(new Powders("Tide", 3.6, 4, GoodsColour.BLUE, GoodsType.POWDERS, "Polyphosphoric acid", 10.9, "White"));
        chemicalSupplyStore.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, GoodsColour.GREEN, GoodsType.SCOURING_PADS, 3.6, "Green"));
        chemicalSupplyStore.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, GoodsColour.GREEN, GoodsType.SCOURING_PADS, 4.6, "Yellow"));

        System.out.println("\nAvailable goods \n");
        printList(chemicalSupplyStore.getGoodsList());

        System.out.println("\nAirFresheners:\n");
        List<Goods> result1 = chemicalSupplyStore.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
        printList(result1);

        System.out.println("\nSorted list:\n");
        chemicalSupplyStore.sortByPrice(result1);
        printList(result1);
    }

    @Test
    public void testGetterGoodsWithValidStoreName() throws NoSuchFieldException, IllegalAccessException {
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("storeName");
        field.setAccessible(true);
        field.set(chemicalSupplyStore, "Epicenter");
        final String result = chemicalSupplyStore.getStoreName();
        assertEquals("Epicenter", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidStoreName() throws NoSuchFieldException, IllegalAccessException {
        String storeName = "Intermarket";
        chemicalSupplyStore.setStoreName(storeName);
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("storeName");
        field.setAccessible(true);
        assertEquals("Intermarket", field.get(chemicalSupplyStore), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Store Name")
    @Test
    public void testSetterGoodsWithInvalidStoreName() {
        String storeName = "";
        assertThrows(IllegalArgumentException.class, () -> {
            chemicalSupplyStore.setStoreName(storeName);
        });
    }

    @Test
    public void testGetterGoodsWithValidAddress() throws NoSuchFieldException, IllegalAccessException {
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("address");
        field.setAccessible(true);
        field.set(chemicalSupplyStore, "Lviv");
        final String result = chemicalSupplyStore.getAddress();
        assertEquals("Lviv", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidAddress() throws NoSuchFieldException, IllegalAccessException {
        String address = "Lviv";
        chemicalSupplyStore.setAddress(address);
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("address");
        field.setAccessible(true);
        assertEquals("Lviv", field.get(chemicalSupplyStore), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Address")
    @Test
    public void testSetterGoodsWithInvalidAddress() {
        String address = "";
        assertThrows(IllegalArgumentException.class, () -> {
            chemicalSupplyStore.setAddress(address);
        });
    }

    @Test
    public void testGetterGoodsWithValidGoodsAmount() throws NoSuchFieldException, IllegalAccessException {
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("goodsAmount");
        field.setAccessible(true);
        field.set(chemicalSupplyStore, 5);
        final int result = chemicalSupplyStore.getGoodsAmount();
        assertEquals(5, result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidGoodsAmount() throws NoSuchFieldException, IllegalAccessException {
        int goodsAmount = 5;
        chemicalSupplyStore.setGoodsAmount(goodsAmount);
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("goodsAmount");
        field.setAccessible(true);
        assertEquals(5, field.get(chemicalSupplyStore), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Goods Amount")
    @Test
    public void testSetterGoodsWithInvalidGoodsAmount() {
        int goodsAmount = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            chemicalSupplyStore.setGoodsAmount(goodsAmount);
        });
    }

    @Test
    public void testGetterGoodsWithValidWorkingHours() throws NoSuchFieldException, IllegalAccessException {
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("workingHours");
        field.setAccessible(true);
        field.set(chemicalSupplyStore, "9-15");
        final String result = chemicalSupplyStore.getWorkingHours();
        assertEquals("9-15", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidWorkingHours() throws NoSuchFieldException, IllegalAccessException {
        String workingHours = "9-15";
        chemicalSupplyStore.setWorkingHours(workingHours);
        final Field field = chemicalSupplyStore.getClass().getDeclaredField("workingHours");
        field.setAccessible(true);
        assertEquals("9-15", field.get(chemicalSupplyStore), "Fields don't match");
    }

    @DisplayName("Test Goods With Invalid Working Hours")
    @Test
    public void testSetterGoodsWithInvalidWorkingHours() {
        String workingHours = "";
        assertThrows(IllegalArgumentException.class, () -> {
            chemicalSupplyStore.setWorkingHours(workingHours);
        });
    }

    @Test
    public void testAddGoods() {
        ChemicalSupplyStore chemicalSupplyStore = new ChemicalSupplyStore("Epicenter", "Lviv", 5, "from 9 to 15");
        List<Goods> goodsList = new LinkedList<>();
        assertTrue(goodsList.isEmpty());
        chemicalSupplyStore.addGoods(new AirFresheners("Airic", 10.5, 5, GoodsColour.GREEN, GoodsType.AIR_FRESHENERS,"Nice", 0.5));
    }

    @Test
    public void testPrintList() {
        List<Goods> goodsList = new LinkedList<>();
        printList(goodsList);
        String expected = "";
        assertEquals(expected,"","Fields don't match");
    }

    @Test
    public final void testGeneralToString() {
        ChemicalSupplyStore chemicalSupplyStore = new ChemicalSupplyStore("chemicalSupplyStore", "Lviv", 10, "from 9 to 21");
        assertFalse(chemicalSupplyStore.toString().contains("@"));
    }

    @Test
    public void testGeneralAddGoods() {
        ChemicalSupplyStore chemicalSupplyStore = new ChemicalSupplyStore("Epicenter", "Lviv", 5, "from 9 to 15");
        List<Goods> goodsList = new LinkedList<>();
        assertTrue(goodsList.isEmpty());
        chemicalSupplyStore.addGoods(new AirFresheners("Airic", 10.5, 5, GoodsColour.BLUE, GoodsType.AIR_FRESHENERS, "Nice", 0.5));
        assertTrue(goodsList.isEmpty());
    }

    @Test
    public void testSortByPrice() {
        ChemicalSupplyStore lol = new ChemicalSupplyStore("chemicalSupplyStore", "Lviv", 10, "from 9 to 21");
        lol.addGoods(new AirFresheners("Yabko", 4.0, 10, GoodsColour.GREEN, GoodsType.AIR_FRESHENERS, "Nyam-nyam", 12.0));
        lol.addGoods(new AirFresheners("Persik", 3.2, 15, GoodsColour.GREEN, GoodsType.AIR_FRESHENERS, "Otpad", 11.0));
        List<Goods> result1;
        result1 = lol.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
        printList(result1);
        List<Goods> result2 = lol.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
        lol.sortByPrice(result2);
        printList(result2);
        assertEquals(result1.get(0), result2.get(1), "Price doesn't match");
    }

    @Test
    public final void testToString() {
        assertFalse(chemicalSupplyStore.toString().contains("@"));
    }

    @AfterEach
    void tearDown() {
        chemicalSupplyStore = null;
    }
}
