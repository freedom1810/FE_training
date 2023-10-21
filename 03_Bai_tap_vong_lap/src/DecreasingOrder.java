import java.util.Scanner;

public class DecreasingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        if (isDecreasingOrder(N)) {
            System.out.println(N + " có các chữ số giảm dần từ trái sang phải.");
        } else {
            System.out.println(N + " không có các chữ số giảm dần từ trái sang phải.");
        }
    }

    public static boolean isDecreasingOrder(int number) {
        int prevDigit = 10;

        while (number > 0) {
            int digit = number % 10;
            if (digit >= prevDigit) {
                return false;
            }
            prevDigit = digit;
            number /= 10;
        }

        return true;
    }
}
