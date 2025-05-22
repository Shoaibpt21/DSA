package search;

import java.util.Scanner;

public class rangeSum {
    public static int sum(int[] arr,int n,int index1,int index2){
        int sum = 0;
        for(int i = index1;i<=index2;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first index: ");
        int index1 = sc.nextInt();
        System.out.println("Enter second index: ");
        int index2 = sc.nextInt();
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(sum(arr,n,index1,index2));
    }
}
