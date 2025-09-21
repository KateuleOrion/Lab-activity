import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {

        // Task 1//

        String name;
        int age;
        float height;
        double weight;
        int jerseyNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the player name: ");
        name = input.nextLine();

        System.out.println("Enter the player's age: ");
        age = input.nextInt();

        System.out.println("Enter the player's height in meters: ");
        height = input.nextInt();

        System.out.println("Enter the player's weight in pounds: ");
        weight = input.nextDouble();

        System.out.println("Enter the player's jersey number:");
        jerseyNumber = input.nextInt();

        System.out.println("The following are details of the player: ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        // TASK 2

        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKg = (int) weight * POUND;

        float heightInCent = height * METER;

        System.out.println("The following are details of the player:  ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Height: " + heightInCent + "m");
        System.out.println("Weight: " + weightInKg + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        //TASK 3

        System.out.println("The current age of the player is: " + age);

        age++;
        jerseyNumber--;

        System.out.println("The player's age is now:  " + age);
        System.out.println("The jersey Number is now: " + jerseyNumber);

        //TASK 4

        boolean eligible = (age >= 18) && (age <= 35) && (weightInKg < 90);
        if (eligible)
            System.out.println("The player is eligible");
        else
            System.out.println("The player is not eligible");

        boolean hasProblem = (age < 18) || (weight >= 90);

        if (hasProblem)
            System.out.println("The player is either too young or overweight");

        boolean notEligible = !eligible;

        if (notEligible)
            System.out.println("The player is Not Eligible");
        else
            System.out.println("The player is Eligible");

        //TASK 5//

        String category;
        if (age < 20)
            category = "Rising Star";
        else if (age < 30)
            category = "Prime Player";
        else
            category = "Veteran";

        System.out.println("Player's category: " + category);

        //TASK 6//

        switch (jerseyNumber) {
            case 1:
                System.out.println("Player position: Goalkeeper");
                break;
            case 2:
                System.out.println("Player position: Defender");
                break;
            case 5:
                System.out.println("Player position: Defender");
                break;
            case 6:
                System.out.println("Player position: midfielder");
                break;
            case 7:
                System.out.println("Player position: Winger");
                break;
            case 8:
                System.out.println("Player position: Midfielder");
                break;
            case 9:
                System.out.println("Player position: Striker");
                break;
            case 10:
                System.out.println("Player position: Playmaker");
                break;
            case 11:
                System.out.println("Player position: Winger");
                break;
            default:
                System.out.println("Player position: Unknown");}


                //Task 7//

                //Part A
        switch (jerseyNumber) {

            case 1:
                System.out.println("Player position: Goalkeeper");
                break;
            case 2 :
                System.out.println("Player position: Defender");

            case 5:
                System.out.println("Player position: Defender");
                break;
            case 6:
                System.out.println("Player position: midfielder");

            case 8:
                System.out.println("Player position: Midfielder");
                break;
            case 7:
                System.out.println("Player position: Winger");
            case 11:
                System.out.println("Player position: Winger");
                break;
            case 9:
                System.out.println("Player position: Striker");
                break;
            case 10:
                System.out.println("Player position: Playmaker");
                break;
            default:
                System.out.println("Player position: Unknown");
        }
        //Part B
        switch (jerseyNumber) {

            case 1:
                System.out.println("Player position: Goalkeeper");
                break;
            case 2, 5:
                System.out.println("Player position: Defender");
                break;
            case 6, 8:
                System.out.println("Player position: Midfielder");
                break;
            case 7, 11:
                System.out.println("Player position: Winger");
                break;
            case 9:
                System.out.println("Player position: Striker");
                break;
            case 10:
                System.out.println("Player position: Playmaker");
                break;
            default:
                System.out.println("Player position: Unknown");
        }

        //Task 8//

        String lineUpDecision;

        if (category.equals("Prime Player")) {
            if (weightInKg < 80) {
                lineUpDecision = "Starting Lineup";
            } else {
                lineUpDecision = "Bench";
            }
        } else{
            lineUpDecision = "Bench";
        }

        System.out.println("The starting lineup decision is: "+ lineUpDecision);

        //Task 9//
        String finalStatus = eligible ? "Play" : "Rest";

        System.out.println("The player should: "+ finalStatus);








    }
}














