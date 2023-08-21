// Assignment Problem
// Problem Name: Guess the output
// Problem Description:     

// public class assignment {
//     public static void main(String[] args){
//     System.out.println();
//     }
// }
class assignment {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        if (x++ > 10 || ++y > 20) {
            System.out.print("Inside if  ");
        } else {
            System.out.print("Inside else  ");
        }
        System.out.println(x + " " + y);
    }
}

// Output: 
// Inside if 11 21