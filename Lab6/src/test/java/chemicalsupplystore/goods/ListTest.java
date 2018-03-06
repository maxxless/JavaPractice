package chemicalsupplystore.goods;

import java.util.*;
import junit.framework.*;

public class ListTest extends TestCase {
    private ArrayList list = new ArrayList();


    public ListTest(String name) {
        super(name);
        for (int i = 0; i < 3; i++)
            list.add("" + i);
    }

    protected void setUp() {

    }

    public void tearDown() {

    }

    public void testInsert() {
        assertEquals(list.size(), 3);
        list.add(1, "Insert");
        assertEquals(list.size(), 4);
        assertEquals(list.get(1), "Insert");
    }

    public void testReplace() {
        assertEquals(list.size(), 3);
        list.set(1, "Replace");
        assertEquals(list.size(), 3);
        assertEquals(list.get(1), "Replace");
    }

    private void compare(ArrayList lst, String[] strs) {
        Object[] array = lst.toArray();
        assertTrue("Not the same length", array.length == strs.length);
        for (int i = 0; i < array.length; i++)
            assertEquals(strs[i], (String) array[i]);
    }

    public void testOrder() {
        compare(list, new String[] { "0", "1", "2" });
    }

    public void testRemove() {
        assertEquals(list.size(), 3);
        list.remove(1);
        assertEquals(list.size(), 2);
        compare(list, new String[] { "0", "2" });
    }

    public void testAddAll() {
        list.addAll(Arrays.asList("Hulla", "Hop"));
        assertEquals(list.size(), 5);
        compare(list,
                new String[] { "0", "1", "2", "Hulla", "Hop"});
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(ListTest.class);
    }
}