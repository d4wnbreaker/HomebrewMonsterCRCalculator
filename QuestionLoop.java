import java.util.Scanner;

/*
    Why not to BinarySearch when using checkThresholds()?
    Unfortunately, BinarySearch will return any of the values that are equal to the value being searched.
    Since I want precision to find the correct ChallengeRating, BinarySearch isn't helpful here.
*/

public class QuestionLoop
{
    Scanner scan = new Scanner (System.in);
    private double userInput;
    private double[] inputHolder = new double[7];

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
    }

    public void questionLoop()
    {
        int i = 0;
        System.out.println("Enter the expected Challenge Rating of the monster you are creating:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Proficiency Bonus of your monster:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Armor Class of your monster:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Hit Points of your monster:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Attack Bonus of your monster:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Damage per Round of your monster:");
        inputHolder[i] = scan.nextDouble();
        i++;

        System.out.println("Enter the Save DC of your monster:");
        inputHolder[i] = scan.nextDouble();
    }

    public double[] getLoopInput()
    {
        return inputHolder;
    }
}
