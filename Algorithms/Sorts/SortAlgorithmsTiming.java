package Algorithms.Sorts;

import java.util.Arrays;
import java.util.Random;

public class SortAlgorithmsTiming {

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 400000};

        for (int size : sizes) {
            System.out.println("Array size: " + size);
            int[] data = generateRandomArray(size);

            measureTime(() -> selectionSort(Arrays.copyOf(data, data.length)), "Selection Sort");
            measureTime(() -> bubbleSort(Arrays.copyOf(data, data.length)), "Bubble Sort");
            measureTime(() -> insertionSort(Arrays.copyOf(data, data.length)), "Insertion Sort");
            measureTime(() -> quickSort(Arrays.copyOf(data, data.length), 0, data.length - 1), "Quick Sort");

            System.out.println();
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Utility: Swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Generate a random array of a given size
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000); // Random numbers between 0 and 999,999
        }
        return arr;
    }

    // Measure execution time of a Runnable
    private static void measureTime(Runnable task, String algorithmName) {
        long start = System.currentTimeMillis();
        task.run();
        long end = System.currentTimeMillis();
        System.out.println(algorithmName + " took " + (end - start) + " ms");
    }
}