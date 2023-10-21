package family;

public class People {

    private String name;
    private int age;
    private String job;
    private String id;

    public People() {}

    public People(String name, int age, String job, String id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Id: " + id);
    }

}

