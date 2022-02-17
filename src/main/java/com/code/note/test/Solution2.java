package com.code.note.test;

import java.util.Arrays;

public class Solution2 {

    public void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }

        int p = partition(arr, left, right);

        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
    }

    private int partition(int[] arr, int left, int right) {

        int l = left;
        int r = right;
        int pivot = l;
        while (l < r) {
            while (arr[l] < arr[pivot] && l < r) {
                l++;
            }

            while (arr[r] > arr[pivot] && l < r) {
                r++;
            }

            swap(arr, l, r);
        }
        swap(arr, l, r);

        return l;
    }

    private void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void main(String[] args) {

        Solution2 s = new Solution2();

        int[] arr = new int[]{12, 1, -1, 441, 32, 3, 9, -11, 2};
        s.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
