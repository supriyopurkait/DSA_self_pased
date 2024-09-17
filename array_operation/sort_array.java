/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2. */

public class sort_array { //used algorimth Duth national algotithm
    public static void main(String [] args)
    {
        int []arr ={0,2,1,2,1,2,1,0,0,0,2,1,0,2};
        sort ob1 = new sort();
        ob1.solution(arr,arr.length);
    }
}
class sort{
    void solution(int arr[],int n)
    {
        int lb=0,mid=0,ub=n-1;
        while(mid<=ub)
        {
            if(arr[mid]==0)
            {
                int temp = arr[mid];
                arr[mid] = arr[lb];
                arr[lb] = temp;
                mid++;lb++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[ub];
                arr[ub] = temp;
                ub--;
            }else{
                mid++;
            }
        }
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}

