import java.util.Scanner;

public class UperLowerBound {
    public static int lowerbound(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left< right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else{
                right= mid;
            }
        }
        return left;
    }
    public static int uperbound(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while ( left <right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return left - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result1 = lowerbound(arr, n);
        int result2 = uperbound(arr, n);

        System.out.println("First Occurence is :-" + result1);
        System.out.println("Last Occurence is :-" + result2);
    }
}