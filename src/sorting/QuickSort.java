package sorting;

public class QuickSort {
    public static void quickSort(int[] list) { //hjælpemetode
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last); //hjælpemetode
            quickSort(list, first, pivotIndex - 1); //rekkursion
            quickSort(list, pivotIndex + 1, last); //rekkursion
        }
    }

    private static int partition(int list[], int first, int last) {
        int pivot = list[first]; //pivot sættes umiddelbart som første element
        int low = first + 1; //index brugt til fremad søgning
        int high = last; //index brugt til baglans søgning

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++; //index for low sættes når list[low] > pivot
            }
            while (low <= high && list[high] > pivot) {
                high--; //index for high sættes når list[high] < pivot
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}
