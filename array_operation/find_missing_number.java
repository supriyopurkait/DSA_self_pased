/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique. */
public class find_missing_number {

    public static void main(String args[]) {
        int[] arr = {1, 0, 3, 5, 4,6};
        solution ob1 = new solution();
        ob1.sol(arr);
    }
}

class solution {

    public void sol(int arr[]) {
        int mis_num = 0, xor_all = 0;
        for (int i = 0; i < arr.length; i++) {
            xor_all = xor_all ^ i;
            mis_num = mis_num ^ arr[i];
        }
        xor_all = xor_all ^ arr.length;
        int num = xor_all ^ mis_num;
        System.out.println(num);
    }
}
