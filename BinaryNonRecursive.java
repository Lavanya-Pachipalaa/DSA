import java.util.Scanner;

public class BinaryNonRecursive {
    public static int binary_recursive(int arr[], int key, int start, int end) {

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Enter no.of elements in array:");
        int n = sc.nextInt();
        System.out.print("Enter elements of array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key element to search:");
        int key = sc.nextInt();
        int start = 0, end = n - 1;
        int index = binary_recursive(arr, key, start, end);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " found at index " + index);
        }
        sc.close();
    }
}
