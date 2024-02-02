public class MergeTwoSortedArray {
    static void mergeArray(int arr1[], int n, int arr2[], int m, int arr3[]) {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // copy kiya first array element
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        // copy kiya second array element
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5, 7, 9 };
        int arr2[] = { 3, 4, 6 };
        int arr3[] = new int[8];
        System.out.println();
        mergeArray(arr1, 5, arr2, 3, arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
