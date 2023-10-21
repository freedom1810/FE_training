package football;

import java.util.ArrayList;
import java.util.Comparator;

public class FootballPlayer {
    private String name;
    private int age;
    private String address;
    private double height;
    private double weight;
    private long salary;

    public FootballPlayer() {}

    public FootballPlayer(String name, int age, String address, double height, double weight, long salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Salary: " + salary);
    }

    public static ArrayList<FootballPlayer> sortSalary(ArrayList<FootballPlayer> players) {
        players.sort(Comparator.comparingLong(FootballPlayer::getSalary));
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
