package assignment2.organizations.myOrg;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;



import java.util.ArrayList;
import java.util.List;

public class ToyStore extends Organization implements Contactable {
    List<Toy> toys = new ArrayList<>();

    public List<Toy> getToys(){
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
    public void addToy(Toy t) {
        toys.add(t);
    }

    public boolean removeToy(Toy t) {
        return toys.remove(t);
    }
    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
