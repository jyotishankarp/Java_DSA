// Assignment Problem
// Problem Name: What is the output
// Problem Description: ####What will be the output ?

public class assignment {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i = i + 1) {
            for (int j = 0; j < 2; j = j + 1) {
                if (j == 1)
                    break;
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}

// Output:0 0