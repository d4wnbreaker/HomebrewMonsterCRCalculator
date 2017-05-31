import java.util.Scanner;

public class HomebrewCalculator
{
    public static void main (String[] args)
    {
        ChallengeRating challengeRating = new ChallengeRating();
        Proficiency proficiency = new Proficiency();
        ArmorClass armorClass = new ArmorClass();
        HitPoints hitPoints = new HitPoints();
        AttackBonus attackBonus = new AttackBonus();
        DamagePerRound damagePerRound = new DamagePerRound();
        SaveDC saveDC = new SaveDC();
        Scanner scan = new Scanner (System.in);
        int[] monsterCreated = new int[6];
        double[] arrayResults = new int[6];
        int value; int j = 0;

        if (j == 0)
        {
            System.out.println("Enter your monster's the Proficiency Bonus: ");
            value = scan.nextInt();
            monsterCreated[i] = value;
            j++;
        }
        else if (j == 1)
        {
            System.out.println("Enter your monster's Armor Class: ");
            value = scan.nextInt();
            monsterCreated[i] = value;
            j++;
        }
        else if (j == 2)
        {
            System.out.println("Enter your monster's HitPoints: ");
            value = scan.nextInt();
            monsterCreated[i] = value;
            j++;
        }
        else if (j == 3)
        {
            System.out.println("Enter your monster's Attack Bonus: ");
            value = scan.nextInt();
            monsterCreated[i] = value;
            j++;
        }
        else if (j == 4)
        {
            System.out.println("Enter your monster's Damage per Round: ");
            value = scan = nextInt();
            monsterCreated[i] = value;
            j++;
        }
        else if (j == 5)
        {
            System.out.println("Enter your monster's Save DC:");
            value = scan = nextInt();
            monsterCreated[i] = value;
            j++;
        }
    }
}
