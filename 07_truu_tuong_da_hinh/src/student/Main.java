package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int currentId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Quản lý học sinh =====");
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Cập nhật điểm học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Xem danh sách học sinh theo lớp");
            System.out.println("6. Sắp xếp theo tên");
            System.out.println("7. Sắp xếp theo tuổi");
            System.out.println("8. Sắp xếp theo điểm");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    viewStudents();
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    updatePoint(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    viewStudentsByClass(scanner);
                    break;
                case 6:
                    sortByName();
                    break;
                case 7:
                    sortByAge();
                    break;
                case 8:
                    sortByPoint();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }

    private static void viewStudents() {
        System.out.println("===== Danh sách học sinh =====");
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private static void addStudent(Scanner scanner) {
        String name, address, classroom;
        int age = 0;
        double point = 0.0;

        do {
            System.out.print("Nhập tên học sinh: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

        do {
            System.out.print("Nhập tuổi: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng new line
            } else {
                System.out.println("Tuổi phải là một số nguyên.");
                scanner.nextLine(); // Đọc bỏ dòng new line
                continue;
            }
        } while (age <= 0);

        do {
            System.out.print("Nhập địa chỉ: ");
            address = scanner.nextLine();
        } while (address.isEmpty());

        do {
            System.out.print("Nhập điểm: ");
            if (scanner.hasNextDouble()) {
                point = scanner.nextDouble();
                scanner.nextLine(); // Đọc bỏ dòng new line
            } else {
                System.out.println("Điểm phải là một số thập phân.");
                scanner.nextLine(); // Đọc bỏ dòng new line
                continue;
            }
        } while (point < 0 || point > 10);

        do {
            System.out.print("Nhập lớp: ");
            classroom = scanner.nextLine();
        } while (classroom.isEmpty());

        Student student = new Student(currentId, name, age, address, point, classroom);
        students.add(student);
        currentId++;
        System.out.println("Học sinh đã được thêm thành công.");
    }


    private static void updatePoint(Scanner scanner) {
        System.out.print("Nhập ID học sinh cần cập nhật điểm: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line
        System.out.print("Nhập điểm mới: ");
        double newPoint = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng new line

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                student.setPoint(newPoint);
                found = true;
                System.out.println("Điểm học sinh đã được cập nhật.");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh với ID " + id);
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập ID học sinh cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                found = true;
                System.out.println("Học sinh đã được xóa.");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh với ID " + id);
        }
    }

    private static void viewStudentsByClass(Scanner scanner) {
        System.out.print("Nhập lớp học cần xem: ");
        String classroom = scanner.nextLine();

        System.out.println("===== Danh sách học sinh lớp " + classroom + " =====");
        for (Student student : students) {
            if (student.getClassroom().equalsIgnoreCase(classroom)) {
                student.displayInfo();
            }
        }
    }

    private static void sortByName() {
        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Danh sách học sinh đã được sắp xếp theo tên.");
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private static void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("Danh sách học sinh đã được sắp xếp theo tuổi.");
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private static void sortByPoint() {
        students.sort(Comparator.comparingDouble(Student::getPoint));

        System.out.println("Danh sách học sinh đã được sắp xếp theo điểm.");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}