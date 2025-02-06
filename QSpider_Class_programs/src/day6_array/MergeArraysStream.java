package day6_array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysStream {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        // Merge arrays using streams
        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
