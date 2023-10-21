package family;
import java.util.ArrayList;
public class Family {

    private String nameF;
    private String status;
    private String add;
    private ArrayList<People> p;

    public Family() {
        // nameF = p.get(0).getName();
    }

    public Family(String add, String status, ArrayList<People> p) {
        this.add = add;
        this.status = status;
        this.p = p;
        nameF = p.get(0).getName();
    }

    public String getNameF() {
        return nameF;
    }

    public String getStatus() {
        return status;
    }

    public String getAdd() {
        return add;
    }

    public ArrayList<People> getP() {
        return p;
    }

    public void display() {
        System.out.println("householder's name: " + nameF);
        System.out.println("Number Member: " + p.size());
        System.out.println("Address: " + add);
        System.out.println("Status: " + status);
        System.out.println("List Information Member");
        for (int i = 0; i < p.size(); i++) {
            p.get(i).display();
        }
    }

    public static ArrayList<Family> getPoorHousehold(ArrayList<Family> fa) {
        ArrayList<Family> v = new ArrayList<>();
        for (int i = 0; i < fa.size(); i++) {
            if (fa.get(i).getStatus().equals("poor")) {
                v.add(fa.get(i));
            }
        }
        return v;
    }

    public static ArrayList<Family> findFamilySurename(ArrayList<Family> fa, String surename) {
        ArrayList<Family> v = new ArrayList<>();
        for (int i = 0; i < fa.size(); i++) {
            if (fa.get(i).getNameF().equals(surename)) {
                v.add(fa.get(i));
            }
        }
        return v;
    }

}


