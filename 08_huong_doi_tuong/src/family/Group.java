package family;

import java.util.ArrayList;

public class Group {

    private String nameGr;
    private ArrayList<Family> f;

    public Group() {}

    public Group(String name, ArrayList<Family> f) {
        this.nameGr = name;
        this.f = f;
    }

    public void display() {
        System.out.println("Name Group " + nameGr);
        for (Family family : f) {
            family.display();
        }
    }

    public ArrayList<Family> getF() {
        return f;
    }

    public int getNumberFamily() {
        return f.size();
    }

    public static double avgAgeGroup(Group v) {
        ArrayList<Family> F = new ArrayList<>(v.getF());
        double sum = 0;
        int n = 0;
        for (Family family : F) {
            ArrayList<People> P = new ArrayList<>(family.getP());
            n += P.size();
            for (People person : P) {
                sum += person.getAge();
            }
        }
        return sum / n;
    }

    public static ArrayList<People> getPeopleHaveNotJob(Group g) {
        ArrayList<People> v = new ArrayList<>();
        ArrayList<Family> listF = new ArrayList<>(g.getF());
        for (Family family : listF) {
            ArrayList<People> P = new ArrayList<>(family.getP());
            for (People person : P) {
                if (person.getJob().equals("")) {
                    v.add(person);
                }
            }
        }
        return v;
    }
}

