public class QuickSort {

    private static int[] array = {45,23,11,89,77,98,4,28,65,43};

    private static void quickSort(int lowerIndex, int higherIndex) {

        int lower = lowerIndex;
        int higher = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (lower <= higher) {

            while (array[lower] < pivot) {
                lower++;
            }

            while (array[higher] > pivot) {
                higher--;
            }

            if (lower <= higher) {
                int temp = array[lower];
                array[lower] = array[higher];
                array[higher] = temp;
                lower++;
                higher--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < higher)
            quickSort(lowerIndex, higher);
        if (lower < higherIndex)
            quickSort(lower, higherIndex);
    }

    public static void main(String[] args){

        //Print unsorted array.
        System.out.print("Unsorted array :");
        for (int anInput : array) {
            System.out.print(anInput + " ");
        }
        System.out.println();

        quickSort(0, array.length - 1);

        //Print sorted array.
        System.out.print("Sorted array   :");
        for (int anInput : array) {
            System.out.print(anInput + " ");
        }
    }
}