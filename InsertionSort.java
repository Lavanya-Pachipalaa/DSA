public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
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
        insertionSort(arr);
    }
}
