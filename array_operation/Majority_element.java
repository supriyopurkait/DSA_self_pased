
import java.util.HashMap;

public class Majority_element {

    public static void main(String[] args) {
        int arr[] = {2, 8, 2, 2, 2, 4};
        Majority_element ob = new Majority_element();
        ob.solution(arr);
    }

    void solution(int arr[]) {
        HashMap<Integer, Integer> mapp = new HashMap<Integer, Integer>();

        // Traverse the array and count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            // Update the count for arr[i] in the map
            mapp.put(arr[i], mapp.getOrDefault(arr[i], 0) + 1);
        }

        // Check if any element appears more than n/2 times
        int n = arr.length;
        boolean foundMajority = false;
        for (HashMap.Entry<Integer, Integer> entry : mapp.entrySet()) {
            if (entry.getValue() > n / 2) {
                System.out.println("Majority element: " + entry.getKey() + " appears " + entry.getValue() + " times.");
                foundMajority = true;
            }
        }

        if (!foundMajority) {
            System.out.println("No majority element found.");
        }
    }
}
