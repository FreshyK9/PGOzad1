
    public class Zad1 {

        public static int[] filterEvenIndexOddValue(int[] arr) {
            int x = 0;

            for (int i = 0; i < arr.length; i += 2) {
                if (arr[i] % 2 != 0) {
                    ++x;
                }
            }

            int[] wyjsc = new int[x];
            int index = 0;

            for (int i = 0; i < arr.length; i += 2) {
                if (arr[i] % 2 != 0) {
                    wyjsc[index++] = arr[i];
                }
            }

            return wyjsc;
        }

        public static void main(String[] args) {
            int[] tabela = new int[]{1, 2, 3, 4, 5, 6};
            int[] gotow = filterEvenIndexOddValue(tabela);

            for (int num : gotow) {
                System.out.print(num + " ");
            }

        }
    }