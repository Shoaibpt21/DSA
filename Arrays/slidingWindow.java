package Array;

import java.util.*;

public class slidingWindow {
    public static int window(int[] arr,int k,int n){
        int maxSum = 0;
        for(int i = 0; i < k; i++){
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for(int i = k;i<n;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        System.out.println("Enter window length: ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(window(arr,k,n));
    }
}
