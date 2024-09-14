/*Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.

Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 5, arr2 [] = {1, 2, 3, 6, 7}
Output: 
1 2 3 4 5 6 7
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 
1 2 3 4 5
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5.
Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 
1 2
Explanation: 
Distinct elements including both the arrays are: 1 2. */

import java.util.ArrayList;

public class union_sorted_array {

    public static void main(String[] arg) {
        int arr1[] = {2, 2, 3, 4, 5};
        int arr2[] = {1, 1, 2, 3, 4};
        solution ob1 = new solution();
        ob1 . sol(arr1, arr2, arr1.length, arr2.length);

    }
}

class solution {

    public static void sol(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        ArrayList<Integer> temp = new ArrayList<>(m + n);
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(arr1[i])) {
                    temp.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(arr2[j])) {
                    temp.add(arr1[i]);
                }
                j++;
            }
        }
        while (i < arr1.length)
        {
            if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(arr1[i])) {
                temp.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length)
        {
            if (temp.size() == 0 || !temp.get(temp.size() - 1).equals(arr2[j])) {
                temp.add(arr2[j]);
            }
            j++;
        }

        for (Integer elem : temp) {
            System.out.print(elem+" ");
            
        }
    }
}
