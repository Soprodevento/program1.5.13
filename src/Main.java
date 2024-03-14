import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,20,8,7,3,100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] numbers) {
        StringJoiner oddNumbers = new StringJoiner(", ");

        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(String.valueOf(num));
            }
        }

        System.out.println(oddNumbers);
    }
}
