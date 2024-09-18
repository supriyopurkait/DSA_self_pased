public class selection {

    public static void main(String[] args) {
        int arr[] = {8, 464, 846, 3516, 3, 74851, 74, 531, 7};
        selection ob1 = new selection();
        ob1.solution(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    void solution(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idk = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idk] > arr[j]) {
                    min_idk = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idk];
            arr[min_idk] = temp;
        }
        return;
    }
}
