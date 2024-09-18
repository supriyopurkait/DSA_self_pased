public class bubble {

    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 1, 9, 7, 2, 8};
        bubble.solution(arr);
    }

    public static void solution(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
