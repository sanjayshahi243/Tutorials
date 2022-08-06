// Merge Sort Algorithm

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] list, int start, int end) {
        if (start == end) {
            return;
        } else if (start == end-1) {
            if (list[start] <= list[end]) {
                return;
            } else { // swap
                int temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }
        
        int mid = (end-start)/2;
        mergeSort(list, start, start + mid);    // left split
        System.out.println("After left split");
        mergeSort(list, start + mid + 1, end);  // right split
        System.out.println("After right split");
        System.out.println(Arrays.toString(merge(list, start, start + mid, end)));
    }
    
    
    private static int[] merge(int[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        for (int i=0; i<leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] listArr = new int[] {9,8,5,4,8,7,2,3};
        mergeSort(listArr, 0, listArr.length-1);
        // System.out.println(Arrays.toString(merged));
    }
}
