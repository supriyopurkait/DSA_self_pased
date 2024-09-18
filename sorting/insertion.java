
public class insertion {

    public static void main(String[] args) {
        int arr[] = {6, 656, 9, 38, 298, 68, 68, 35, 9, 89, 8, 59, 7};
        insertion ob2 = new insertion();
        ob2.solution(arr);
    }

    void solution(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int current_ele = arr[i];
            int j = i-1;
            while (j >= 0 && current_ele < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            //sorted place for the element
            arr[j + 1] = current_ele;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
