import java.util.*;
public class MaximumContinuousOnce {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1,1,1,0,1,1};
        int count = 0;
        int max = 0;
        for(int i = 0;i < arr.length -1 ;i++){
            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(count,max);
        }
       System.out.println(max);
    }
}
