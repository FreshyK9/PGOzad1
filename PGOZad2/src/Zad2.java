public class Zad2 {
    public static int findDominant(int[] array) {
        int x = -1, i = 0;
        for (int num : array) {
            if (i == 0) {
                x = num;
            }
            i += (num == x) ? 1 : -1;
        }
        i = 0;
        for (int num : array) {
            if (num == x) {
                i++;
            }
        }
        return i > array.length / 2 ? x : -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 1};
        System.out.println(findDominant(arr));
    }
}
