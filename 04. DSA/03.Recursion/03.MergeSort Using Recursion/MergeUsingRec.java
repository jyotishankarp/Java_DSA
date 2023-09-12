public class MergeUsingRec {
    public static void mergeSort(int arr[], int SI, int EI) {
        if (SI >= EI) {
            return;
        }
        int mid = (SI + EI) / 2;
        // part 1
        mergeSort(arr, SI, mid);
        // part 2
        mergeSort(arr, mid + 1, EI);
        // Here i apply mergesort function;
        merge(arr, SI, EI);
    }

    private static void merge(int input[], int SI, int EI) {
        int mid = (SI + EI) / 2;
        int ans[] = new int[EI - SI + 1];
        int i = SI;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= EI) {
            if (input[i] < input[j]) {
                ans[k] = input[i];
                // ans[i] = input[j]
                i++;
                k++;
            } else {
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            ans[k] = input[i];
            i++;
            k++;
        }
        while (j <= EI) {
            ans[k] = input[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 65, 65, 465, 46, 65, 46, 6, 465, 46, 54, 654, 65, 32, 132, 3, 3, 1313, 323, 6, 46, 6, 46 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(arr);
        System.out.println();
    }
}
