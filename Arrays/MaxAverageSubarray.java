package Array;

import java.util.Scanner;

public class MaxAverageSubarray {
    public static double maxAver(int[] arr,int n, int k){
        int maxSum = 0;
        for(int i = 0; i < k; i++){
            maxSum += arr[i];
        }
        double maxAverage =(double)maxSum/k;
        int windowSum = maxSum;
        for(int i = k;i < n;i++){
            windowSum += arr[i] - arr[i - k];
           double windowAverage =(double) windowSum / k;
            maxAverage = Math.max(windowAverage,maxAverage);
        }
        return  maxAverage;
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
        System.out.print(maxAver(arr,n,k));
    }
}

