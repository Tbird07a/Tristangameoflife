import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int age = 18;
        double chance_death = 0;
        boolean education = false;
        int money = 0;
        String job = "No job!";
        String spouse = "No spouse!";
        String house = "No house!";
        String car = "No car!";
        int salary = 0;
        int salary_increase = 0;
        boolean alive = true;
        double spouse_death = 0;
        double kid_leaving = 0;
        int kids = 0;
        spouse wifu = null;
        kids children = null;
        Scanner name1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name: ");
        String name = name1.nextLine();


        System.out.println("Welcome to the game of life!");
        System.out.println("You are 18 years old. You have until you are 50 to meet all of your life goals.");
        System.out.println("To win, you must achieve all of these goals before you hit 50: ");
        System.out.println("Be alive, have a job, have a spouse, have a house, have a car, have more than $0, and have at least one child");
        System.out.println("Every year you can complete one action. Your chance of death will increase every year. You can drop dead at any age. The only way to lower your chance of death is to eat salad. ");
        System.out.println("You only need 1 house, 1 car, and 1 spouse. if you try and more the gods will consider you greedy and ruin you. KIDS ARE EXPENSIVE. BEING IN DEBT INCREASES CHANCE OF DEATH.");
        System.out.println("Life has begun!");

        Profile profile = new Profile();
        profile.profile_maker(age, chance_death, education, money, salary, job, name, house, car, spouse, kids);
        String job1 = profile.initial_question();
        if (Objects.equals(job1, "Police Officer")) {
            System.out.println("You are a police officer!");
            job = "Police Offer";
            salary = 60000;
            chance_death += 4;
            salary_increase = 2000;
        }
        if (Objects.equals(job1, "Bus Driver")) {
            System.out.println("You are a Bus Driver!");
            job = "Bus Driver";
            salary = 35000;
            salary_increase = 200;
        }
        if (Objects.equals(job1, "Construction Worker ")) {
            System.out.println("You are a Construction Worker!");
            job = "Construction Worker";
            salary = 40000;
            salary_increase = 1000;
            chance_death += 1;

        }
        if (Objects.equals(job1, "Student")) {
            System.out.println("You are a Student! Fastforwarding 4 years and 280k in debt!");
            age += 4;
            money -= 280000;
            education = true;
            String job2 = profile.College(education);
            if (Objects.equals(job2, "Finance Bro")) {
                System.out.println("You are a Finance Bro!");
                job = "Finance Bro";
                salary = 80000;
                salary_increase = 4000;
            }
            if (Objects.equals(job2, "Nurse")) {
                System.out.println("You are a Nurse!");
                job = "Nurse";
                salary = 70000;
                salary_increase = 3000;
                chance_death -= 2;
            }
        }

        while (age <= 50 && alive) {

            profile.profile_maker(age, chance_death, education, money, salary, job, name, house, car, spouse, kids);
            age = age + 1;
            chance_death = chance_death + 1;
            money = money + salary;
            salary = salary + salary_increase;



            System.out.println("Player Menu: ");
            System.out.println("'S' to get a spouse");
            System.out.println("'K' to have a kid");
            System.out.println("'H' to buy a house");
            System.out.println("'C' to buy a car");
            System.out.println("'E' to eat salad");
            System.out.println("'N' to do nothing");

            Scanner choice = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter choice: ");
            String choice1 = choice.nextLine();

            if (Objects.equals(choice1, "S")) {
                spouse = profile.spouse();
                System.out.println("Your spouse is " + spouse);
            }
            if (Objects.equals(choice1, "K"))
            {
                kids = profile.Child(kids);
                System.out.println("You now have " + kids + " children");

            }
            if (Objects.equals(choice1, "H")) {
                boolean house1 = profile.buy_house(money);
                if (house1) {
                    house = "You have a house!";
                } else {
                    house = "No house!";
                }
            }
            if (Objects.equals(choice1, "C")) {
                boolean car1 = profile.buy_car(money);
                if (car1) {
                    car = "You have a car!";
                } else {
                    car = "No car!";
                }
            }
            if (Objects.equals(choice1, "E")) {
                chance_death = profile.salad(chance_death);
            }
            if (Objects.equals(choice1, "N")) {
                System.out.println("You did nothing!");
            }

            if (!spouse.equals("No spouse!")) {
                spouse_death += 3;
                assert wifu != null;
                boolean spouse_alive = wifu.spouse_life(spouse_death);
                if (!spouse_alive) {
                    spouse = "No spouse!";
                    spouse_death = 0;
                }
            }

            if (kids > 0) {
                int childcare_cost = kids * 20000;
                money -= childcare_cost;
                assert children != null;
                kids = children.kid_life(kid_leaving, kids);
                kid_leaving += 3;
            }

            Random death = new Random();
            int random_number = death.nextInt(0, 100);

            if (money < 0) {
                chance_death += 0.5;
            }

            if (random_number < chance_death) {
                System.out.println("YOU HAVE DIED! YOU LOST!");
                alive = false;
            }
        }

        if (age > 49 && !job.equals("No job!") && !spouse.equals("No spouse!") && !house.equals("No house!") && !car.equals("No car!") && (money > 0 && kids > 0) ) {
            System.out.println("YOU HAVE WON THE GAME OF LIFE CONGRATS!");
        }
        else {
            System.out.println("TRY AGAIN!");
        }


        {



    }
}}

