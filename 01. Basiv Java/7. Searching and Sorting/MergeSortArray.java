public class MergeSortArray {
    public static int[] merge(int[] arr1, int arr2[]) {
        int i = 0, j = 0, k = 0;
        int arr[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
                i++;
            }
        }
        // remaining element
        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        // remaining element
        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6 };
        int arr[] = merge(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// issue with this code
