public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

        //Print unsorted array.
        System.out.print("Unsorted array :");
        for (int anInput : array) {
            System.out.print(anInput + " ");
        }
        System.out.println();

        for (int i = 0; i <= array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                int k = j + 1;

                if (array[j] > array[k]) {

                    int temp;
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;

                }
            }
        }

        //Print sorted array.
        System.out.print("Sorted array   :");
        for (int anInput : array) {
            System.out.print(anInput + " ");
        }
    }
}
