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
        int ans = new int[]
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
