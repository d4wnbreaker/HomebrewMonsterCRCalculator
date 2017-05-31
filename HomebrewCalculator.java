public class HomebrewCalculator
{
    public static void main (String[] args)
    {
        ChallengeRating cr = new ChallengeRating();
        double[] challengeRating = cr.getCR();
        
        for (int i = 0; i < challengeRating.length; i++)
        {
            System.out.println(challengeRating[i]);
        }
    }
}
