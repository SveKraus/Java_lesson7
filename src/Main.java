import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Human human1 = new Human("abc", "last");
       Human human2 = new Human("pklz", "yelp");
       Human human3 = new Human("rpng","note");
       Human human4 = new Human("ppza", "xyz");

        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);

       Collections.sort(humans);
        System.out.println(humans);

        for(Human hum: humans) {
            System.out.println(hum.getName() + " | " + hum.getSurname());
        }

    }
}
