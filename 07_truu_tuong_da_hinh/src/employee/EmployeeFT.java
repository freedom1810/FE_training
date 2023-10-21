package employee;

import java.util.List;
import java.util.ArrayList;

class EmployeeFT extends Person {
    private int day;
    private long money;

    public EmployeeFT() {
    }

    public EmployeeFT(String name, int age, String address, String tel, String sex, int day, long money) {
        super(name, age, address, tel, sex);
        this.day = day;
        this.money = money;
    }

    public int getDay() {
        return day;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Day: " + day + ", ");
        System.out.print("Money: " + money);
        System.out.println();
    }

    @Override
    public long salary() {
        return day * money;
    }

    public static List<EmployeeFT> getMaxSalary(List<EmployeeFT> employees) {
        List<EmployeeFT> result = new ArrayList<>();
        long maxSalary = 0;

        for (EmployeeFT employee : employees) {
            long salary = employee.salary();
            if (salary > maxSalary) {
                maxSalary = salary;
                result.clear();
                result.add(employee);
            } else if (salary == maxSalary) {
                result.add(employee);
            }
        }

        return result;
    }
}