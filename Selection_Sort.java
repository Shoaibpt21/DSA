import java.util.*;
class Selection_sort {
    static void sssort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
                int temp = arr[minimum];
                arr[minimum] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the valeues");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sssort(arr, n);
        System.out.println("After sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}