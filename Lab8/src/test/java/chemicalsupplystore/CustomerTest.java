package chemicalsupplystore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class CustomerTest {
    private Customer customer;

    @BeforeEach
    void init() {
        customer = new Customer("Ihor", "Pankiv", 5, 1);
    }

    @Test
    public void testGetterCustomerWithValidName() throws NoSuchFieldException, IllegalAccessException {
        final Field field = customer.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(customer, "Roman");
        final String result = customer.getName();
        assertEquals("Roman", result, "Fields don't match");
    }

    @Test
    public void testSetterCustomerWithValidName() throws NoSuchFieldException, IllegalAccessException {
        String name = "Taras";
        customer.setName(name);
        final Field field = customer.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("Taras", field.get(customer), "Fields don't match");
    }

    @DisplayName("Test Customer With Invalid Name")
    @Test
    public void testSetterCustomerWithInvalidName() {
        String name = "";
        assertThrows(IllegalArgumentException.class, () -> {
            customer.setName(name);
        });
    }

    @Test
    public void testGetterCustomerWithValidSurname() throws NoSuchFieldException, IllegalAccessException {
        final Field field = customer.getClass().getDeclaredField("surname");
        field.setAccessible(true);
        field.set(customer, "Ivanenko");
        final String result = customer.getSurname();
        assertEquals("Ivanenko", result, "Fields don't match");
    }

    @Test
    public void testSetterCustomerWithValidSurname() throws NoSuchFieldException, IllegalAccessException {
        String surname = "Ivanenko";
        customer.setSurname(surname);
        final Field field = customer.getClass().getDeclaredField("surname");
        field.setAccessible(true);
        assertEquals("Ivanenko", field.get(customer), "Fields don't match");
    }

    @DisplayName("Test Customer With Invalid Surname")
    @Test
    public void testSetterCustomerWithInvalidSurname() {
        String surname = "";
        assertThrows(IllegalArgumentException.class, () -> {
            customer.setSurname(surname);
        });
    }

    @Test
    public void testGetterCustomerWithValidAmountOfMoney() throws NoSuchFieldException, IllegalAccessException {
        final Field field = customer.getClass().getDeclaredField("availableAmountOfMoney");
        field.setAccessible(true);
        field.set(customer, 10.5);
        final double result = customer.getAvailableAmountOfMoney();
        assertEquals(10.5, result, "Fields don't match");
    }

    @Test
    public void testSetterCustomerWithValidAmountOfMoney() throws NoSuchFieldException, IllegalAccessException {
        double availableAmountOfMoney = 10.5;
        customer.setAvailableAmountOfMoney(availableAmountOfMoney);
        final Field field = customer.getClass().getDeclaredField("availableAmountOfMoney");
        field.setAccessible(true);
        assertEquals(10.5, field.get(customer), "Fields don't match");
    }

    @DisplayName("Test Customer With Invalid Amount Of Money")
    @Test
    public void testSetterCustomerWithInvalidAmountOfMoney() {
        double availableAmountOfMoney = -100.0;
        assertThrows(IllegalArgumentException.class, () -> {
            customer.setAvailableAmountOfMoney(availableAmountOfMoney);
        });
    }

    @Test
    public void testGetterCustomerWithValidNumberOfNecessaryGoods() throws NoSuchFieldException, IllegalAccessException {
        final Field field = customer.getClass().getDeclaredField("numberOfNecessaryGoods");
        field.setAccessible(true);
        field.set(customer, 5);
        final int result = customer.getNumberOfNecessaryGoods();
        assertEquals(5, result, "Fields don't match");
    }

    @Test
    public void testSetterCustomerWithValidNumberOfNecessaryGoods() throws NoSuchFieldException, IllegalAccessException {
        int numberOfNecessaryGoods = 5;
        customer.setNumberOfNecessaryGoods(numberOfNecessaryGoods);
        final Field field = customer.getClass().getDeclaredField("numberOfNecessaryGoods");
        field.setAccessible(true);
        assertEquals(5, field.get(customer), "Fields don't match");
    }

    @DisplayName("Test Customer With Invalid Number Of Necessary Goods")
    @Test
    public void testSetterCustomerWithInvalidNumberOfNecessaryGoods() {
        int numberOfNecessaryGoods = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            customer.setNumberOfNecessaryGoods(numberOfNecessaryGoods);
        });
    }

    @Test
    public final void testToString() {
        assertFalse(customer.toString().contains("@"));
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }
}