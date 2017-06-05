import java.util.Scanner;
import java.util.ArrayList;

/*
    Why not to BinarySearch when checking for values?
    BynarySearch wouldn't work for some classes because there are repeated values.
    According to the Oracle documentation, it would return any of the repeated values,
    thus not making it very reliable to pinpoint what's the CR for any input that is
    repeated through a threshold.
*/

public class QuestionLoop
{
    Scanner scan = new Scanner (System.in);
    private double userInput;
    private int[] inputHolder = new int[7];
    private int challengeRatingPosition;
    private ArrayList<Integer> proficiencyPosition = new ArrayList<Integer>();
    private ArrayList<Integer> armorClassPosition = new ArrayList<Integer>();
    private int hitPointsPosition;
    private ArrayList<Integer> attackBonusPosition = new ArrayList<Integer>();
    private int damagePerRoundPosition;
    private ArrayList<Integer> saveDCPosition = new ArrayList<Integer>();
    /*
    public void makeItAll() // I mean, I know it's not really an informative method name, but I couldn't resist.
    {
        ChallengeRating challengeRating = new ChallengeRating();
        DamagePerRound damagePerRound = new DamagePerRound();
        AttackBonus attackBonus = new AttackBonus();
        Proficiency proficiency = new Proficiency();
        ArmorClass armorClass = new ArmorClass();
        HitPoints hitPoints = new HitPoints();
        SaveDC saveDC = new SaveDC();

        damagePerRound.getDamagePerRound();
        attackBonus.getAttackBonus();
        proficiency.getProficiency();
        armorClass.getArmorClass();
        hitPoints.getHitPoints();
        challengeRating.getCR();
        saveDC.getSaveDC();
    } */

    public void questionLoop()
    {
        ChallengeRating challengeRating = new ChallengeRating();
        DamagePerRound damagePerRound = new DamagePerRound();
        AttackBonus attackBonus = new AttackBonus();
        Proficiency proficiency = new Proficiency();
        ArmorClass armorClass = new ArmorClass();
        HitPoints hitPoints = new HitPoints();
        SaveDC saveDC = new SaveDC();

        damagePerRound.getDamagePerRound();
        attackBonus.getAttackBonus();
        proficiency.getProficiency();
        armorClass.getArmorClass();
        hitPoints.getHitPoints();
        challengeRating.getCR();
        saveDC.getSaveDC();

        int i = 0;
        System.out.println("Enter the expected Challenge Rating of the monster you are creating:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Proficiency Bonus of your monster:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Armor Class of your monster:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Hit Points of your monster:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Attack Bonus of your monster:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Damage per Round of your monster:");
        inputHolder[i] = scan.nextInt();
        i++;

        System.out.println("Enter the Save DC of your monster:");
        inputHolder[i] = scan.nextInt();

        for (int j = 0; j < inputHolder.length; j++)
        {
            switch (j)
            {
                case 0:
                    System.out.println("Your desired CR is: " + inputHolder[0]);
                    if (challengeRating.isBetween(inputHolder[0]))
                    {
                        System.out.println("The value " + inputHolder[0] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[0] + " isn't within 5e rules.");
                        System.out.println("The minimum CR is 0 and the maximum is 30.");
                        System.out.println();
                    }

                break;
                case 1:
                    System.out.println("Your desired Proficiency Bonus is: " + inputHolder[1] + ".");
                    if (proficiency.isBetween(inputHolder[1]))
                    {
                        System.out.println("The value " + inputHolder[1] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[1] + " isn't within 5e rules.");
                        System.out.println("The minimum Proficiency Bonus is 2 and the maximum is 9.");
                        System.out.println();
                    }
                case 2:
                    System.out.println("Your desired Armor Class is: " + inputHolder[2] + ".");
                    if (armorClass.isBetween(inputHolder[2]))
                    {
                        System.out.println("The value " + inputHolder[2] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[2] + " isn't within 5e rules.");
                        System.out.println("The minimum Armor Class is 13 and the maximum is 19.");
                        System.out.println();
                    }
                case 3:
                    System.out.println("Your desired Hit Points is: " + inputHolder[3] + ".");
                    if (hitPoints.isBetween(inputHolder[3]))
                    {
                        System.out.println("The value " + inputHolder[3] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[3] + " isn't within 5e rules.");
                        System.out.println("The minimum Hit Points is 1 and the maximum is 850.");
                        System.out.println();
                    }
                case 4:
                    System.out.println("Your desired Attack Bonus is: " + inputHolder[4] + ".");
                    if (attackBonus.isBetween(inputHolder[4]))
                    {
                        System.out.println("The value " + inputHolder[4] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[4] + " isn't within 5e rules.");
                        System.out.println("The minimum Attack Bonus is 3 and the maximum is 14.");
                        System.out.println();
                    }
                case 5:
                    System.out.println("Your desired Damage Per Round is: " + inputHolder[5] + ".");
                    if (damagePerRound.isBetween(inputHolder[5]))
                    {
                        System.out.println("The value " + inputHolder[5] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[5] + " isn't within 5e rules.");
                        System.out.println("The minimum Damage Per Round is 0 and the maximum is 320.");
                        System.out.println();
                    }
                case 6:
                    System.out.println("Your desired Save DC is: " + inputHolder[6] + ".");
                    if (saveDC.isBetween(inputHolder[6]))
                    {
                        System.out.println("The value " + inputHolder[6] + " is within 5e rules.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("The value " + inputHolder[6] + " isn't within 5e rules.");
                        System.out.println("The minimum Save DC is 13 and the maximum is 23.");
                        System.out.println();
                    }
                break;
            }
        }
    }

    public int[] getLoopInput()
    {
        return inputHolder;
    }
}
