import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySmallIntegerSetTest {

    private SmallIntegerSet set;

    @BeforeEach
    void setUp() {
        set = new ArraySmallIntegerSet(100);
    }

    @Test
    void isInitiallyEmpty() {
        for (int i = 0; i < 100; i++) {
            assertFalse(set.contains(i));
        }
    }

    @Test
    void addsKey() {
        set.add(23);
        assertTrue(set.contains(23));
    }

    @Test
    void doesNotAddOtherKey() {
        set.add(23);
        assertFalse(set.contains(42));
    }

    @Test
    void removesKey() {
        set.add(23);
        set.remove(23);
        assertFalse(set.contains(23));
    }

    @Test
    void doesNotRemoveOtherKey() {
        set.add(23);
        set.add(42);
        set.remove(42);
        assertTrue(set.contains(23));
    }

}