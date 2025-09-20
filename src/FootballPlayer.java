import java.util.Scanner;

public class FootballPlayer {
    public static void main (String [] args) {

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
        
        System.out.println("The following are details of the player: ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age +"years");
        System.out.println("Height: " +height + "m");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        // TASK 2

        final double POUND = 0.45359237;
        final int METER = 100;

        double weightInKg = (int) weight * POUND;

        int heightInCent = height*METER;

        System.out.println("The following are details of the player:  ");
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age +"years");
        System.out.println("Height: " +heightInCent + "m");
        System.out.println("Weight: " + weightInKg + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);





    }
}
