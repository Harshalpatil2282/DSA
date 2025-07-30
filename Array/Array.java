import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the Array :");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.print("Enter the elements of the Array :");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Entered  Array is :");
//         for (int j = 0; j < size; j++) {
//             System.out.print(arr[j] + " ");
//         }

//     }
// }


public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an Array :");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered Elemnts Are :");

        System.out.print("[");
        for(int j=0;j<size;j++){
            System.out.print(+arr[j]+",");
        }
        System.out.println("]");
    }
}