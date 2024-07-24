package Algorithms;

public class Sort {
    public static int[] mergeSort(int[] arr, int left, int right) {
//        int left = 0, right = arr.length - 1;
        if (left == right) {
            int[] result = {arr[left]};
            return result;
        }
        System.out.println("Chia " + left + " - " + right );
        int middle = (left + right) / 2;
        int[] arr1 = mergeSort(arr, left, middle);
        int[] arr2 = mergeSort(arr, middle + 1, right);
        int[] result = merge(arr1, arr2);
        return result;
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int index = 0, index1 = 0, index2 = 0;
        int n = arr1.length + arr2.length;
        int[] newArr = new int[n];
        while (index < n) {
            if(index1 < arr1.length && index2 < arr2.length) {
                if(arr1[index1] < arr2[index2]) {
                    newArr[index] = arr1[index1];
                    index++;
                    index1++;
                } else {
                    newArr[index] = arr2[index2];
                    index++;
                    index2++;
                }
            } else {
                if(index1 < arr1.length) {
                    newArr[index] = arr1[index1];
                    index++;
                    index1++;
                } else {
                    newArr[index] = arr2[index2];
                    index++;
                    index2++;
                }
            }
        }
        return newArr;
    }
//    Quick sort
    public static int[] quickSort(int[] arr, int left, int right) {
        return arr;

    }
    public static int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i, right);
        return i+1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
