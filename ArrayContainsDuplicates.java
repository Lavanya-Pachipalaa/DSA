public class ArrayContainsDuplicates {
    public static boolean containsDuplicates(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 3, 7, 2, 5 };
        if (containsDuplicates(arr)) {
            System.out.println("Array contains Duplicates");
        } else {
            System.out.println("No duplicates");
        }
    }
}
