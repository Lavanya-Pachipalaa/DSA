public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array After Sorting: ");
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
        bubbleSort(arr);
    }
}
