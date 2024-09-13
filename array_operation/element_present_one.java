
public class element_present_one {

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 8, 2, 6, 5, 7, 6, 7};
        element_present_one ob1 = new element_present_one();
        ob1.solution(arr);
    }

    void solution(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        System.out.print(sum + ": is the element present in array once");
    }
}
