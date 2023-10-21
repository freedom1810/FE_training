package employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các nhân viên FT và PT
        List<EmployeeFT> employeesFT = new ArrayList<>();
        List<EmployeePT> employeesPT = new ArrayList<>();

        // Thêm một số nhân viên FT và PT vào danh sách
        employeesFT.add(new EmployeeFT("Nguyen A", 30, "123 Street", "1234567890", "Male", 20, 2000000));
        employeesFT.add(new EmployeeFT("Nguyen B", 28, "456 Street", "0987654321", "Female", 22, 2500000));

        employeesPT.add(new EmployeePT("Tran X", 35, "789 Street", "1112223333", "Male", 40, 30000));
        employeesPT.add(new EmployeePT("Le Y", 25, "555 Street", "4445556666", "Female", 35, 35000));

        // Hiển thị thông tin của các nhân viên
        System.out.println("Danh sách nhân viên Full-time:");
        for (EmployeeFT employeeFT : employeesFT) {
            employeeFT.display();
        }

        System.out.println("Danh sách nhân viên Part-time:");
        for (EmployeePT employeePT : employeesPT) {
            employeePT.display();
        }

        // Tìm danh sách nhân viên có lương cao nhất
        List<EmployeeFT> maxSalaryFT = EmployeeFT.getMaxSalary(employeesFT);
        List<EmployeePT> maxSalaryPT = EmployeePT.getMaxSalary(employeesPT);

        System.out.println("Nhân viên Full-time có lương cao nhất:");
        for (EmployeeFT employeeFT : maxSalaryFT) {
            employeeFT.display();
        }

        System.out.println("Nhân viên Part-time có lương cao nhất:");
        for (EmployeePT employeePT : maxSalaryPT) {
            employeePT.display();
        }
    }
}

