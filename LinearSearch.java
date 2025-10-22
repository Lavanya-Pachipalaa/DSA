//Java code to implement linear search

import java.util.Scanner;;

public class LinearSearch {
    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.print("Enter no.of elements in array:");
        int n = sc.nextInt();
        System.out.print("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key element to search:");
        int key = sc.nextInt();
        int index = linear_search(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " found at index " + index);
        }
        sc.close();
    }
}
