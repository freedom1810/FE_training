import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        int maxDigit = findMaxDigit(N);

        System.out.println("Chữ số lớn nhất trong " + N + " là " + maxDigit);
    }

    public static int findMaxDigit(int number) {
        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }

        return maxDigit;
    }
}
