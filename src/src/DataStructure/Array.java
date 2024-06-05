package DataStructure;

import java.util.Arrays;

public class Array {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        for (int k = 0; k < newArray.length; k++) {
            if (i >= arr1.length) {
                newArray[k] = arr2[j];
                j++;
            } else if (j >= arr2.length) {
                newArray[k] = arr1[i];
                i++;
            } else if (arr1[i] < arr2[j]) {
                newArray[k] = arr1[i];
                i++;
            } else {
                newArray[k] = arr2[j];
                j++;
            }
        }
        return newArray;
    }
    public static  int[] sort(int[] arr, String order) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (order == "asc") {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
        }
        return arr;
    };

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    };

    public static <T> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void swap(char[] arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return String.valueOf(arr);
    }

    public static String caseMangle(String str) {
        char[] arr = str.toCharArray();
        boolean upper = false;
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            if(!Character.isLetter(arr[i])) continue;
            if (first) {
                upper = Character.isUpperCase(arr[i]);
                first = false;
            }
            if (upper) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
            upper = !upper;
        }
        return String.valueOf(arr);
    }
}
