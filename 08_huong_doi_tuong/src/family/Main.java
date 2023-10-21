package family;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        People p1 = new People("John Doe", 30, "Software Engineer", "1");
        People p2 = new People("Jane Doe", 28, "Teacher", "2");

        People p3 = new People("Jax Doe", 30, "Software Engineer", "1");
        People p4 = new People("Jin Doe", 28, "Teacher", "2");

        // Create a group

        // p1.display();
        // p2.display();
        // p3.display();
        // p4.display();

        ArrayList<People> pList1 = new ArrayList<>();
        pList1.add(p1);
        pList1.add(p2);

        ArrayList<People> pList2 = new ArrayList<>();
        pList2.add(p3);
        pList2.add(p4);

        Family f1 = new Family("HN", "rich", pList1);
        Family f2 = new Family("HCM", "poor", pList2);

        // f1.display();
        //    f2.display();

        ArrayList<Family> fList1 = new ArrayList<>();
        ArrayList<Family> fList2 = new ArrayList<>();

        fList1.add(f1);
        fList2.add(f2);

        Group g1 = new Group("G1", fList1);
        Group g2 = new Group("G2", fList2);

        g1.display();
        // g2.display();
        double avgAge = Group.avgAgeGroup(g1);
        System.out.println(avgAge);
    }
}

