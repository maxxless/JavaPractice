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
public class InsectRepellentsTest {
    private InsectRepellents insectRepellents;

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
    public void testGetterInsectRepellentsWithValidKillZoneRadius() throws NoSuchFieldException, IllegalAccessException {
        final Field field = insectRepellents.getClass().getDeclaredField("killZoneRadius");
        field.setAccessible(true);
        field.set(insectRepellents, 10.5);
        final double result = insectRepellents.getKillZoneRadius();
        assertEquals(10.5, result, "Fields don't match");
    }

    @Test
    public void testSetterAirFreshenersWithValidKillZoneRadius() throws NoSuchFieldException, IllegalAccessException {
        double killZoneRadius = 10.5;
        insectRepellents.setKillZoneRadius(killZoneRadius);
        final Field field = insectRepellents.getClass().getDeclaredField("killZoneRadius");
        field.setAccessible(true);
        assertEquals(10.5, field.get(insectRepellents), "Fields don't match");
    }

    @DisplayName("Test Insect Repellents With Invalid Kill Zone Radius")
    @Test
    public void testSetterInsectRepellentsWithInvalidKillZoneRadius() {
        double killZoneRadius = -100.0;
        assertThrows(IllegalArgumentException.class, () -> {
            insectRepellents.setKillZoneRadius(killZoneRadius);
        });
    }

    @Test
    public void testGetterInsectRepellentsWithValidVolume() throws NoSuchFieldException, IllegalAccessException {
        final Field field = insectRepellents.getClass().getDeclaredField("volume");
        field.setAccessible(true);
        field.set(insectRepellents, 10.5);
        final double result = insectRepellents.getVolume();
        assertEquals(10.5, result, "Fields don't match");
    }

    @Test
    public void testSetterInsectRepellentsWithValidVolume() throws NoSuchFieldException, IllegalAccessException {
        double volume = 10.5;
        insectRepellents.setVolume(volume);
        final Field field = insectRepellents.getClass().getDeclaredField("volume");
        field.setAccessible(true);
        assertEquals(10.5, field.get(insectRepellents), "Fields don't match");
    }

    @DisplayName("Test Insect Repellents With Invalid Volume")
    @Test
    public void testSetterInsectRepellentsWithInvalidVolume() {
        double volume = -100.0;
        assertThrows(IllegalArgumentException.class, () -> {
            insectRepellents.setVolume(volume);
        });
    }

    @Test
    public void testGetterInsectRepellentsWithValidGoodsType() throws NoSuchFieldException, IllegalAccessException {
        final Field field = insectRepellents.getClass().getDeclaredField("goodsType");
        field.setAccessible(true);
        field.set(insectRepellents, GoodsType.INSECT_REPELLENTS);
        final GoodsType result = insectRepellents.getGoodsType();
        assertEquals(GoodsType.INSECT_REPELLENTS, result, "Fields don't match");
    }

    @Test
    public void testGetterInsectRepellentsWithValidGoodsColour() throws NoSuchFieldException, IllegalAccessException {
        final Field field = insectRepellents.getClass().getDeclaredField("goodsColour");
        field.setAccessible(true);
        field.set(insectRepellents, GoodsColour.WHITE);
        final GoodsColour result = insectRepellents.getGoodsColour();
        assertEquals(GoodsColour.WHITE, result, "Fields don't match");
    }

    @Test
    public final void testToString() {
        assertFalse(insectRepellents.toString().contains("@"));
    }

    @AfterEach
    void tearDown() {
        insectRepellents = null;
    }
}
