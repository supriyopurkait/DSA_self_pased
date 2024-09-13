public class remove_zeroes{
    public static void main(String[] args) {
        int []arr = {1,2,0,8,55,4,3,0,74,0,4,1,0,4,0,4,0,7};
        remove_zeroes ob1 = new remove_zeroes();
        ob1.solution(arr);
    }
    void solution(int arr[])
    {
        int index=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                index= i;
                break;
            }
        }
        for(int i=index,j=index+1; j<arr.length; j++)
        {
            if(arr[j] != 0)
            {
                arr[i] = arr[j];
                arr[j] = 0;
                i++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1 */