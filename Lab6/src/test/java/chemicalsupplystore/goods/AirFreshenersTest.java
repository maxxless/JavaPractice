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
public class AirFreshenersTest {
    private AirFresheners airFresheners;

    @BeforeEach
    void init() {

        airFresheners = new AirFresheners("Airic", 10.5, 5, "Nice", 0.5);
        Customer taras = new Customer("Taras", "Gag", 100.5, 10);
        taras.toString();

        ChemicalSupplyStore koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");
        koshyk.toString();

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
    public void testGetterAirFreshenersWithValidSmell() throws NoSuchFieldException, IllegalAccessException {
        final Field field = airFresheners.getClass().getDeclaredField("smell");
        field.setAccessible(true);
        field.set(airFresheners, "Good");
        final String result = airFresheners.getSmell();
        assertEquals("Good", result, "Fields don't match");
    }

    @Test
    public void testSetterAirFreshenersWithValidSmell() throws NoSuchFieldException, IllegalAccessException {
        String smell = "Good";
        airFresheners.setSmell(smell);
        final Field field = airFresheners.getClass().getDeclaredField("smell");
        field.setAccessible(true);
        assertEquals("Good", field.get(airFresheners), "Fields don't match");
    }

    @DisplayName("Test Air Fresheners With Invalid Smell")
    @Test
    public void testSetterAirFreshenersWithInvalidSmell() {
        String smell = "";
        assertThrows(IllegalArgumentException.class, () -> {
            airFresheners.setSmell(smell);
        });
    }

    @Test
    public void testGetterAirFreshenersWithValidVolume() throws NoSuchFieldException, IllegalAccessException {
        final Field field = airFresheners.getClass().getDeclaredField("volume");
        field.setAccessible(true);
        field.set(airFresheners, 10.5);
        final double result = airFresheners.getVolume();
        assertEquals(10.5, result, "Fields don't match");
    }

    @Test
    public void testSetterAirFreshenersWithValidVolume() throws NoSuchFieldException, IllegalAccessException {
        double volume = 10.5;
        airFresheners.setVolume(volume);
        final Field field = airFresheners.getClass().getDeclaredField("volume");
        field.setAccessible(true);
        assertEquals(10.5, field.get(airFresheners), "Fields don't match");
    }

    @DisplayName("Test Air Fresheners With Invalid Volume")
    @Test
    public void testSetterAirFreshenersWithInvalidVolume() {
        double volume = -100.0;
        assertThrows(IllegalArgumentException.class, () -> {
            airFresheners.setVolume(volume);
        });
    }

    @Test
    public void testGetterAirFreshenersWithValidGoodsType() throws NoSuchFieldException, IllegalAccessException {
        final Field field = airFresheners.getClass().getDeclaredField("goodsType");
        field.setAccessible(true);
        field.set(airFresheners, GoodsType.AIR_FRESHENERS);
        final GoodsType result = airFresheners.getGoodsType();
        assertEquals(GoodsType.AIR_FRESHENERS, result, "Fields don't match");
    }

    @Test
    public void testGetterAirFreshenersWithValidGoodsColour() throws NoSuchFieldException, IllegalAccessException {
        final Field field = airFresheners.getClass().getDeclaredField("goodsColour");
        field.setAccessible(true);
        field.set(airFresheners, GoodsColour.WHITE);
        final GoodsColour result = airFresheners.getGoodsColour();
        assertEquals(GoodsColour.WHITE, result, "Fields don't match");
    }

    @Test
    public final void testToString() {
        assertFalse(airFresheners.toString().contains("@"));
    }

    @AfterEach
    void tearDown() {
        airFresheners = null;
    }
}
