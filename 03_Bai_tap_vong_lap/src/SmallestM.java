import java.util.Scanner;

public class SmallestM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số N: ");
        int N = scanner.nextInt();

        int M = findSmallestM(N);

        System.out.println("Số M nhỏ nhất sao cho 1 + 2 + ... + M > " + N + " là " + M);

        System.out.print("Dãy số cộng: ");
        for (int i = 1; i <= M; i++) {
            System.out.print(i);
            if (i < M) {
                System.out.print(" + ");
            }
        }
    }

    public static int findSmallestM(int N) {
        int sum = 0;
        int M = 1;

        while (sum <= N) {
            sum += M;
            M++;
        }

        return M - 1;
    }
}
