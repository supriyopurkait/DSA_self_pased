import java.util.*;

public class Two_sum {
    public static void main(String []args){
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        Solution ob1 = new Solution();  // Use correct class name 'Solution' (uppercase)
        String re = ob1.sum_num(arr, target);
        System.out.println(re);
    }
}

class Solution {  // Class name should start with uppercase 'S'
    String sum_num(int arr[], int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                break; // Exit loop once a solution is found
            }
            mpp.put(num, i);
        }
        
        // Output the result
        System.out.println("Indices: " + ans[0] + ", " + ans[1]);
        return ans[0]+" "+ans[1];
    }
}
