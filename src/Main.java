import java.util.Random;
public class Main {
    public static void main(String[] args)
    {



        //1.Generate a random number between 1 and 100.
        int randomNumber = generateRandomNumber(1, 100);
        //2.Print the random number.
        System.out.println("Your random number is: " + randomNumber);
        //3.Check is the number even or odd.
        if (randomNumber % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
    public static int generateRandomNumber(int min, int max)

    {

        Random random = new Random();
        return random.nextInt((max - min + 1)) + min;
    }
}