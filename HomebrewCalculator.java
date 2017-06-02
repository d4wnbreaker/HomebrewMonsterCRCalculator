import java.util.Scanner;

public class HomebrewCalculator
{
    public static void main (String[] args)
    {
        QuestionLoop loop = new QuestionLoop();
        Scanner scan = new Scanner(System.in);
        String userInput; boolean satisfied = false;
        double[] array = loop.getLoopInput();

        loop.makeItAll(); // YES!

        do {

            loop.questionLoop();

            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }

            System.out.println("Are you satisfied? << Y/N >>.");
            userInput = scan.nextLine().toUpperCase();

            if(userInput.equals("Y"))
            {
                satisfied = true;
            }
        } while (!satisfied);

        System.out.println("Whenever you need to enter here again, knock three times on the blue window.");
        System.out.println("Goodbye.");
    }
}
