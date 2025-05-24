package search;
import java.util.*;
public class binarySearch {
    public static int binary(int x,int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(binary(x,arr));
    }
}
