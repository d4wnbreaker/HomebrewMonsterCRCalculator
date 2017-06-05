import java.util.Scanner;
import java.util.ArrayList;

public class HomebrewCalculator
{
    public static void main (String[] args)
    {
        QuestionLoop loop = new QuestionLoop();
        Scanner scan = new Scanner(System.in);
        String userInput; boolean satisfied = false;

        do {

            loop.questionLoop();

            System.out.println("Are you satisfied? << Y/N >>");
            userInput = scan.nextLine().toUpperCase();

            if (userInput.equals("Y"))
            {
                satisfied = true;
            }

        } while (!satisfied);

        System.out.println("Whenever you need to enter here again, knock three times on the blue window.");
        System.out.println("Goodbye.");
    }
}

/*
    - Check if the inputs are in between the proper numbers.
        - Check CR, check Proficiency, check Armor Class... ✅
    - Return the results and suggestions of adjustments to the user compared to the initial CR input.
        - ((Def + Off) / 2), return value rounded up, return CR of every value from input
    - Maybe return an evaluation of how close the monster is to be balanced? Idk.
    - GUI for v2
*/
