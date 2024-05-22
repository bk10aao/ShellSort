public class ShellSort {

    public static void sort(Comparable[] c) {
        int n = c.length;
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;
        while (h >= 1) {
            for(int i = h; i < n; i++)
                for (int j = i; j >= h && less(c[j], c[j - h]); j -= h)
                    exchange(c, j, j - h);
            h /= 3;
        }
    }

    private static boolean less(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) < 0;
    }

    private static void exchange(Comparable[] c, int i, int j) {
        Comparable swap = c[i];
        c[i] = c[j];
        c[j] = swap;
    }
}
