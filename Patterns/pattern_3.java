import java.util.*;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row :");
        int n = sc.nextInt(); // n=4
        System.out.println("Enter number of colomns :");
        int m = sc.nextInt(); //m=5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

// Output
// *
// **
// ***
// ****
