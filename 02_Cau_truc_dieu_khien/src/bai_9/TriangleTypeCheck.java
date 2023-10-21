package bai_9;

import java.util.Scanner;

public class TriangleTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of three sides (a, b, c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện tạo thành tam giác
        if (a + b > c && a + c > b && b + c > a) {
            String triangleType = "Tam giác thường";

            // Kiểm tra điều kiện tam giác đều
            if (a == b && b == c) {
                triangleType = "Tam giác đều";
            }
            // Kiểm tra điều kiện tam giác cân
            else if (a == b || a == c || b == c) {
                triangleType = "Tam giác cân";

                // Kiểm tra điều kiện tam giác vuông cân
                if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                    triangleType = "Tam giác vuông cân";
                }
            }
            // Kiểm tra điều kiện tam giác vuông
            else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                triangleType = "Tam giác vuông";
            }

            System.out.println("Đây là " + triangleType);
        } else {
            System.out.println("Không phải tam giác.");
        }
    }
}
