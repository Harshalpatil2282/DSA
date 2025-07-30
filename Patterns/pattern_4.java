import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt(); // n = 4
        System.out.println("Enter the number of columns  :");
        int m = sc.nextInt(); // m = 5
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { // j++ => j=j+1 ; j-- => j=j-1
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

// Output:
// 1
// 12
// 123
// 1234