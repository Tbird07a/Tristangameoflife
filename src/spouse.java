
import java.util.Random;


public class spouse
{
    // default constructor; no instance variables
    public spouse() { }

    public boolean spouse_life(double spouse_chance_death) {
        boolean present = true;
        Random random = new Random();
        int random_number = random.nextInt(100);
        if (random_number < spouse_chance_death) {
            System.out.println("Your spouse has vanished over night.");
            present = false;
        }
        return present;
    }

    }

