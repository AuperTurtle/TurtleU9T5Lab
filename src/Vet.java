import java.util.ArrayList;
public class Vet {

    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal temp) {
        if (!clients.contains(temp)) {
            clients.add(temp);
            System.out.println("Welcome to " + name + "'s office, " + temp.getName() + "!");
        }   else    {
            System.out.println(temp.getName() + " is already a client of " + name + "!");
        }
    }
}
