package bmi;

public class BMI {
    double weight;
    double height;

    public void calculateBMI1() {
        double bmi = weight / (height * height);
        System.out.println("Result from calculateBMI1: " + bmi);
    }
    public double calculateBMI2() {
        return weight / (height * height);
    }

    public static double calculateBMI3(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        BMI bmiObject = new BMI();


        bmiObject.weight = 70.0;
        bmiObject.height = 1.75;


        bmiObject.calculateBMI1();


        double result2 = bmiObject.calculateBMI2();
        System.out.println("Result from calculateBMI2: " + result2);

        double result3 = calculateBMI3(80.0, 1.80); // Gọi phương thức tĩnh trực tiếp
        System.out.println("Result from calculateBMI3: " + result3);

        //    Phương thức số 1 thích hợp khi bạn muốn tính và in ra chỉ số bmi.BMI ngay lập tức từ các thuộc tính của đối tượng.
        //    Phương thức số 2 thích hợp khi bạn muốn lưu giá trị bmi.BMI và xử lý chúng sau này.
        //    Phương thức số 3 thích hợp khi bạn chỉ muốn tính bmi.BMI mà không cần lưu trữ thông tin trong một đối tượng bmi.BMI.

    }
}
