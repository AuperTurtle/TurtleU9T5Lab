import java.util.ArrayList;
public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer temp) {
        if (!performers.contains(temp)) {
            performers.add(temp);
            return true;
        }   else    {
            return false;
        }
    }

    public boolean removePerformer(Performer temp) {
        if (performers.contains(temp)) {
            for (int i = 0; i < performers.size(); i++) {
                if (performers.get(i).getName().equals(temp.getName())) {
                    performers.remove(i);
                }
            }
            return true;
        }   else {
            return false;
        }
    }

    public double averagePerformerAge() {
        double temp = 0;
        for (int i = 0; i < performers.size(); i++) {
            temp += performers.get(i).getAge();
        }
        return temp / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> temp = new ArrayList<Performer>();
        for (int i = 0; i < performers.size(); i++) {
            if (performers.get(i).getAge() >= age) {
                temp.add(performers.get(i));
            }
        }
        return temp;
    }

    public void groupRehearsal() {
        for (int i = 0; i < performers.size(); i++) {
            System.out.println("REHEARSAL CALL! " + performers.get(i).getName());
            performers.get(i).rehearse();
        }
    }

    public void cabaretShow() {
        for (int i = 0; i < performers.size(); i++) {
            System.out.println("Welcome to the cabaret! Next act up... " + performers.get(i).getName());
            if (performers.get(i) instanceof Dancer) {
                ((Dancer) performers.get(i)).pirouette(2);
                performers.get(i).perform();
            }   else    {
                performers.get(i).perform();
            }
        }
    }
}
