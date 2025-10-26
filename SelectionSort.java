public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Array after sorting: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 1, 8 };
        System.out.print("Array before Sorting: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        selectionSort(arr);
    }
}
