import java.util.Objects;
import java.util.Scanner;
import java.util.Random;


public class Profile
{
    // default constructor; no instance variables
    public Profile() { }








    public void profile_maker(int age, double chance_death, boolean education, int money, int salary, String job, String name, String house, String car, String spouse, int kids) {
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Educated: " + education + "\n" + "Money: " + money + "\n" + "Salary: " + salary + "\n" + "job: " + job + "\n" + "Chance of death: " + chance_death+ "% \n" + "House: " + house + "\n" + "Car: " + car + "\n" + "Spouse: " + spouse + "\n" + "Number of Kids: " + kids + "\n");

    }








    public String initial_question() {


        System.out.println("Would you like to go to college (cost $280k) or get a job (free)? ");
        Scanner start = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 'C' for college or 'J' for job: ");
        String response = start.nextLine();
        if (Objects.equals(response, "J")) {
            String job_menu = "Choose a job!" + "\n" + "ENTER 'P' for Police Offier - Pay: $60,000, Raise: $2,000 a year, +4% of death" + "\n" + "ENTER 'B' for Bus Driver - Pay: $35,000, Raise: $200 a year" + "\n" + "ENTER 'C' for Construction Worker - Pay: $40,000, Raise: $1000 a year";
            System.out.println(job_menu);
            Scanner job = new Scanner(System.in);  // Create a Scanner object
            String job_response = job.nextLine();
            if (Objects.equals(job_response, "P")) {
                job_response = "Police Officer";
            }
            else if (Objects.equals(job_response, "B")) {
                job_response = "Bus Driver";
            }
            else if (Objects.equals(job_response, "C")) {
                job_response = "Construction Worker";




            }
            return job_response;
        }
        if (Objects.equals(response, "C")) {
            System.out.println("You have been educated");
            return "Student";




        }
        return response;
    }




    public String College(boolean education) {
        String job_response = null;
        if (education == true) {
            String job_menu = "Choose a job!" + "\n" + "ENTER 'F' for Finance Bro - Pay: $80,000, Raise: $4,000 a year" + "\n" + "ENTER 'N' for Nurse - Pay: $70,000, Raise: $3000 a year, -2% chance of death";
            System.out.println(job_menu);
            Scanner job = new Scanner(System.in);  // Create a Scanner object
            job_response = job.nextLine();
            if (Objects.equals(job_response, "F")) {
                job_response = "Finance Bro";
            }
            if (Objects.equals(job_response, "N")) {
                job_response = "Nurse";
            }


        }
        return job_response;
    }


    public boolean buy_house( int money)  {
        String home_menu = "Want to buy a house? Cost is $750,000 'Y' for Yes 'N' for No";
        boolean decision = false ;
        System.out.println(home_menu);
        Scanner home1 = new Scanner(System.in);  // Create a Scanner object
        String home_response = home1.nextLine();
        if (Objects.equals(home_response, "Y") && money >= 750000)
        {
            System.out.println("You have bought a home!");
            decision = true;
        }
        else {
            System.out.println("WHY DID YOU EVEN TRY!");
        }
        return decision;
    }


    public boolean buy_car( int money)  {
        String home_menu = "Want to buy a car? Cost is $50,000 'Y' for Yes 'N' for No";
        boolean decision = false;
        System.out.println(home_menu);
        Scanner home1 = new Scanner(System.in);  // Create a Scanner object
        String home_response = home1.nextLine();
        if (Objects.equals(home_response, "Y") && money >= 50000)
        {
            System.out.println("You have bought a car!");
            decision = true;
        }
        else {
            System.out.println("WHY DID YOU EVEN TRY!");
        }
        return decision;
    }


    public String spouse() {
        System.out.println("You will now recieve a spouse!");
        String spouse1 = "Sally Weathers";
        String spouse2 = "Count Thunder";
        String spouse3 = "Meowlicious";
        String spouse4 = "Kit Connor";
        Random random = new Random();
        int random_number = random.nextInt(0,3);
        if (random_number == 0) {
            return spouse1;
        }
        if (random_number == 1) {
            return spouse2;
        }
        if (random_number == 2) {
            return spouse3;
        }
        if (random_number == 3) {
            return spouse4;
        }
        return spouse1;
    }

    public int Child(int kids) {
        System.out.println("You will now recieve a child!");
        Random random = new Random();
        int random_number = random.nextInt(0, 2);
        System.out.println("You had " + random_number + " kids.");
        kids += random_number;
        return kids;
    }

    public double salad(double chance_death) {
        chance_death = chance_death -  0.5;
        System.out.println("Yum! Salad! Decreased chance of death unlocked");
        return chance_death;
    }







    }


