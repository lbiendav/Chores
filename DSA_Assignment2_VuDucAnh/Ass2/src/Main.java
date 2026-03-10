import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PART 1: SELECTION SORT TEST CASES =====");
        int[][] testCases = {
            {64, 25, 12, 22, 11},       
            {1, 2, 3, 4, 5},            
            {5, 4, 3, 2, 1},            
            {10},                       
            {},                           
            {2, 2, 1, 3, 1},          
            {-5, 10, 0, -2, 8},           
            {100, 200, 50},                
            {7, 7, 7, 7},                  
            {9, 1, 8, 2, 7, 3}              
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i].clone();
            int swaps = SelectionSort.sort(arr);
            System.out.print("Test Case #" + (i + 1) + ": ");
            System.out.println(Arrays.toString(testCases[i]) + " => Swaps: " + swaps);
        }

        System.out.println("\n===== PERFORMANCE ANALYSIS (Small vs Medium vs Large) =====");
        runPerformanceTest(10);    // Small
        runPerformanceTest(100);   // Medium
        runPerformanceTest(1000);  // Large
    }

    public static void runPerformanceTest(int size) {
        int[] arr = new Random().ints(size, 0, 10000).toArray();
        int[] arrForBubble = arr.clone();

        long start = System.nanoTime();
        SelectionSort.sort(arr);
        long end = System.nanoTime();
        
        System.out.println("Size: " + size + " | Time: " + (end - start)/1000 + " microseconds");
    }
}