package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 0, 9, 6};
        divide(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int arr[], int start, int end) {
        if (end - start <= 1) {
            return;  // base case: one element
        }
        int mid = (start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid, end);
        sorting(arr, start, mid, end);
    }

    public static void sorting(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start];
        int i = start, j = mid, k = 0;

        // merge two halves
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // copy remaining elements
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < end) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }
}
