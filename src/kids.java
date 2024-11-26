
import java.util.Random;


public class kids
{
    // default constructor; no instance variables
    public kids() { }

    public int kid_life(double kid_chance_leave, int kids) {
        Random random = new Random();
        int random_number = random.nextInt(100);
        if (random_number < kid_chance_leave) {
            System.out.println("A child has vanished over night.");
            kids --;
        }
        return kids;
    }

}
