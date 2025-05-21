import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); // Last element is always a leader

        // Traverse the array from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {11,3,5,9,4,6};
        ArrayList<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);
    }
}
