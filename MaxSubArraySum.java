public class MaxSubArraySum {
    public static void maxSum_bruteforce(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum using bruteforce approach:" + maxSum);
    }

    public static void maxSum_prefixArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum using prefix array:" + maxSum);
    }

    public static void maxSum_kadanesAlgo(int arr[]) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
        }
        System.out.println("Max Sum using kadanes's Algorithm:" + sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -3, 4, -2, 8 };
        maxSum_bruteforce(arr);
        maxSum_prefixArray(arr);
        maxSum_kadanesAlgo(arr);
    }
}
