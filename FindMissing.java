import java.util.*;
public class FindMissing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arr = new int[c];
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int missing = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i] + 1 != arr[i+1]){
                missing = arr[i]+1;
            }
        }
        System.out.println(missing);
    }
}
