import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {

        // Task 1//

        String name;
        int age;
        int height;
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
        input.close();

        System.out.println("The following are details of the player: ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        // TASK 2

        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKg = (int) (weight * POUND);

        int heightInCent = height * METER;

        System.out.println("The following are details of the player:  ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Height: " + heightInCent + "m");
        System.out.println("Weight: " + weightInKg + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        //Task 3//

        System.out.println("Player's current age is: " + age);
        // increased age by 1
        age++;

        // simulated penalty
        jerseyNumber--;

        System.out.println("The player's new age is: " + age + " and their jersey number is now: " + jerseyNumber);

        //Task 4//

        boolean eligible = (age >= 18 && age <= 35 && weightInKg <= 90);
        if(eligible){
            System.out.println("The player is eligible");}
        else{
            System.out.println("The player is NOT eligible");
        }

        boolean hasProblems =(age < 18 || weightInKg >= 90);
        if (hasProblems){
            System.out.println("Player has a problem: either he is too young or overweight!!");}


        boolean isEligible = (!(age >= 18 && age <= 35 && weightInKg <= 90));
        if (isEligible){
            System.out.println("Eligible");}
        else{
            System.out.println("NOT ELIGIBLE");}


        //Task 5//
        String category;
        if (age < 20)
            category = "Rising Star";
        else if (age < 30)
            category = "Prime Player";
        else
            category = "Veteran";

        System.out.println(name + " Is part of the category " + category);

        //Task 6//


        switch (jerseyNumber){
            case 1:
                System.out.println("Player position: Goalkeeper");
                break;
            case 2:System.out.println("Player position: Defender");
                break;
            case 5:
                System.out.println("Player position:  Defender");
                break;
            case 8:
                System.out.println("Player position: Midfielder");
                break;
            case 6:
                System.out.println("Player position:  Midfielder");
                break;
            case 7:
                System.out.println("Player position:  Winger");
                break;
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
                System.out.println(" Player position not known");
                break;}

                //TASK 7
            //Part A
            switch (jerseyNumber){
                case 1:
                    System.out.println("Player position: Goalkeeper");
                    break;
                case 2:System.out.println("Player position: Defender");
                case 5:
                    System.out.println("Player position:  Defender");
                    break;
                case 6:
                    System.out.println("Player position:  Midfielder");
                case 8:
                    System.out.println("Player position: Midfielder");
                    break;

                case 7:
                    System.out.println("Player position:  Winger");
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
                    System.out.println(" Player position not known");
                    break;}
        //Part B

        switch (jerseyNumber) {
            case 1:
                System.out.println("Player position: Goalkeeper");
                break;
            case 2, 5:
                System.out.println("Player position:Defender");
                break;
            case 6, 8:
                System.out.println("Player position:  Midfielder");
                break;

            case 7, 11:
                System.out.println("Player position:  Winger");
                break;
            case 9:
                System.out.println("Player position: Striker");
                break;
            case 10:
                System.out.println("Player position: Playmaker");
                break;
            default:
                System.out.println(" Player position not known");
                break;
        }


        // TASK 8//

        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (weightInKg < 80) {
                lineupDecision = "Starting lineup";
            } else {
                lineupDecision = "Benched";
            }
        } else {
            lineupDecision = "Benched";
        }
        System.out.println("Lineup Decision: " + lineupDecision);


        // TASK 9//
        String finalStatus = isEligible ? "Play":"Rest";
        System.out.println("Final status: " + finalStatus);

        boolean isAttacker = (jerseyNumber >= 7 && jerseyNumber <= 11);

        System.out.println(isAttacker);










    }


    }



















