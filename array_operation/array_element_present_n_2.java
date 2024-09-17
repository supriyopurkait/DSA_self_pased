
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
