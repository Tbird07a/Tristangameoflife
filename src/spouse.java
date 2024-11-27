import java.util.Random;


public class spouse
{
    int spouse_chance_death = 0;
    // default constructor; no instance variables
    public spouse() { }

    private int spouse_death() {
        spouse_chance_death += 3;
        return spouse_chance_death;
    }

    public boolean spouse_life() {
        boolean present = true;
        spouse_death();
        Random random = new Random();
        int random_number = random.nextInt(100);
        if (random_number < spouse_chance_death) {
            System.out.println("Your spouse has vanished over night.");
            spouse_chance_death = 0;
            present = false;
        }
        return present;
    }

    public String toString() {
        String my_string = "Your spouse has a " + String.valueOf(spouse_chance_death) + "% chance of vanishing";
        return my_string;

    }

    }

