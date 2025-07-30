import java.util.*;
// Hollow rectangle
class pattern_2 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        n = sc.nextInt(); // n = 4
        System.out.println("Enter the number of columns :");
        m = sc.nextInt(); // m = 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || j == m || i == n) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// output :
// *****
// *   *
// *   *
// *****