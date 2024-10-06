
public class array_element_present_n_2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 4, 2, 2, 8, 7, 2, 3, 1, 2};
        int result = solution.optimized(arr, arr.length);
        if (result != -1) {
            System.out.println("element present");
        } else {
            System.out.println("element is not present");
        }
    }
}

class solution {

    static int optimized(int arr[], int length) {
        int ele = 0, count = 0, count1 = 0;
        for (int i = 0; i < length; i++) {
            if (count == 0) {
                ele = arr[i];
                count++;
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        for (int i : arr) {
            if (i == ele) {
                count1++;
            }
        }
        if (count1 > (length / 2)) {
            System.out.println(ele + " is the element present more than N/2 times.\n present no of times " + count1);
            return ele;
        }
        return -1;
    }

    // Map<int,int> optimal(int arr[], int length){
    // }
}

/*The intuition behind this algorithm names moorse voting algorithm is 
 * First step is we will consider the element in index 0 then we will take another variable which will count the number of times the element will present
 *  Second rule is if the next value is is equal to the value which we have considered then we increase the value of the count variable
 * 3rd rule is if the variable or the element in array index means we have considered the element in zero index if we find some other elements in one index then we will decrease the value of the count
 * 4th rule is when the count value will be is equal to zero then we will interchange or initialize next new value at that present index means if we are present in 5th index or 4th index the value will be initialized the value of that particular index
 */