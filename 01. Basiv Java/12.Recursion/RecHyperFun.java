// HYPER FUNCTION(or Function Overloading)
public class RecHyperFun {

    public static boolean CheckSorted(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        int smallArr[] = new int[arr.length - 1];
        for (int i = 0; i < smallArr.length; i++) {
            smallArr[i] = arr[i + 1];
        }
        boolean smallAns = CheckSorted(smallArr);
        if (!smallAns) {
            return false;
        }
        if (arr[0] <= arr[1]) {
            return true;
        } else {
            return false;
        }
    }

    // Better Approach(this fun check if the array is sortef from start index to
    // end)
    // Better Approach
    private static boolean checkSortedBetter(int input[], int startIndex) {
        if (startIndex == input.length - 1) {
            return true;
        }
        if (input[startIndex] > input[startIndex + 1]) {
            return false;
        }
        boolean smallAns = checkSortedBetter(input, startIndex + 1);
        return smallAns;
    }

    public static boolean checkSortedBetter(int input[]) {
        return checkSortedBetter(input, 0);
    }

    public static void main(String[] args) {
        int input[] = { 2, 4, 5, 8, 9, 1 };
        System.out.println(checkSortedBetter(input));
    }
}
