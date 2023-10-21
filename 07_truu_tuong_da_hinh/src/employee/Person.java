package employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private int age;
    private String address;
    private String tel;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String address, String tel, String sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdd() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getSex() {
        return sex;
    }

    public void display() {
        System.out.print("Name: " + getName() + ", ");
        System.out.print("Age: " + getAge() + ", ");
        System.out.print("Address: " + getAdd() + ", ");
        System.out.print("Tel: " + getTel() + ", ");
        System.out.print("Sex: " + getSex() + ", ");
    }

    public abstract long salary();

    public static List<Person> findPerson(List<Person> people, String nameToFind) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(nameToFind)) {
                result.add(person);
            }
        }
        return result;
    }
}
