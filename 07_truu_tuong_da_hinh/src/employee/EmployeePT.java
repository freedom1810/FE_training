package employee;

import java.util.ArrayList;
import java.util.List;

class EmployeePT extends Person {
    private int hour;
    private long money;

    public EmployeePT() {
    }

    public EmployeePT(String name, int age, String address, String tel, String sex, int hour, long money) {
        super(name, age, address, tel, sex);
        this.hour = hour;
        this.money = money;
    }

    public int getHour() {
        return hour;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Hour: " + hour + ", ");
        System.out.print("Money: " + money);
        System.out.println();
    }

    @Override
    public long salary() {
        return hour * money;
    }

    public static List<EmployeePT> getMaxSalary(List<EmployeePT> employees) {
        List<EmployeePT> result = new ArrayList<>();
        long maxSalary = 0;

        for (EmployeePT employee : employees) {
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
