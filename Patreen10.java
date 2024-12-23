public class Patreen10 {

    public static void main(String[] args) {
        int n = 4;  // Number of rows in the top half of the pattern (including the middle)
        
        // Printing the top half of the diamond pattern (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Printing the bottom half of the diamond pattern
        for (int i = n - 1; i >= 1; i--) {
            // Printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
