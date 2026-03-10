import java.util.Arrays;

public class SelectionSort {
    public static int sort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }
        return swapCount;
    }

    public static void printResult(String label, int[] arr, int swaps) {
        System.out.println("--- " + label + " ---");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Swaps performed: " + swaps);
        System.out.println();
    }
}
