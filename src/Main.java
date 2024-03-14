public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int num : arr) {
            if (num % 2 != 0) {
                if (oddNumbers.length() > 0) {
                    oddNumbers.append(",");
                }
                oddNumbers.append(num);
            }
        }
        System.out.println(oddNumbers.toString());
    }
}
