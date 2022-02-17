package com.code.note.sort;

import com.code.note.tree.HeapNode;

import java.util.Arrays;

public class HeapSort {

    public void buildBigHeap(int[] arr, int parent, int len) {
        int child = parent * 2 + 1;
        while (child < len) {
            if (child + 1 < len && arr[child] < arr[child + 1]) {
                child++;
            }

            if (arr[child] <= arr[parent]) {
                break;
            }

            swap(arr, child, parent);

            parent = child;
            child = 2 * child + 1;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void print(int[] arr) {
        HeapNode b = new HeapNode();
        b.insertLevelOrder(arr);
        b.print();
    }

    public void heapSort(int[] arr) {
        // 构建大顶堆
        for (int i = arr.length / 2; i >= 0; i--) {
            buildBigHeap(arr, i, arr.length);
        }

        print(arr);


        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            buildBigHeap(arr, 0, i);
        }

    }

    public static void main(String[] args) {

        HeapSort s = new HeapSort();

        int[] arr = new int[]{3, 2, 1, 4, 5, 6, 11, -1};

        s.print(arr);

        s.heapSort(arr);


        System.out.println(Arrays.toString(arr));
    }
}
