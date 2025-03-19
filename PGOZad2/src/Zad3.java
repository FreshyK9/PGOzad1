import java.util.Arrays;

public class Zad3 {
    public static int[] rotateArray(int[] tab, int rotations) {
        int n = tab.length;

        for (int i = 0; i < rotations; i++) {
            int last = tab[n - 1];
            for (int j = n - 1; j > 0; j--) {
                tab[j] = tab[j - 1];
            }
            tab[0] = last;
        }
        return tab;
    }
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        int positions = 2;
        tab = rotateArray(tab, positions);
        System.out.println(Arrays.toString(tab));
    }
}