public class PairsOfArray {
    public static void print_pairs_of_array(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        print_pairs_of_array(numbers);
    }
}