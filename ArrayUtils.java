public class ArrayUtils {
    public static boolean hasNegative(int[] arr) {
        for (int num : arr) {
            if (num < 0)
                return true;
        }
        return false;
    }
}
