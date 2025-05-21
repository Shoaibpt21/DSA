package Array;

import java.util.Scanner;

public class MaximumContinuousOcnceIII {
    public static int longestOnes(int[] nums, int k,int n) {
        int left = 0,right = 0,maxLength = 0,zeroCount = 0;
        for(right = 0;right<n;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            if(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]  = sc.nextInt();
        }
        System.out.print(longestOnes(nums,k,n));
    }
}
