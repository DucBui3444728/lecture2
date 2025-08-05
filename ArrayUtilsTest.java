import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    void testAllPositive() {
        int[] arr = { 1, 2, 3, 4 };
        assertFalse(ArrayUtils.hasNegative(arr));
    }

    @Test
    void testWithNegative() {
        int[] arr = { 1, -2, 3 };
        assertTrue(ArrayUtils.hasNegative(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertFalse(ArrayUtils.hasNegative(arr));
    }

    @Test
    void testAllNegative() {
        int[] arr = { -1, -5, -9 };
        assertTrue(ArrayUtils.hasNegative(arr));
    }
}