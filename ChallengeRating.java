public class ChallengeRating extends QuestionLoop
{
    private double[] challengeRating = new double[34];
    private int arrayPosition;

    public void makeCR()
    {
        challengeRating[0]  = 0;
        challengeRating[1]  = 0.125;
        challengeRating[2]  = 0.25;
        challengeRating[3]  = 0.5;
        challengeRating[4]  = 1;
        challengeRating[5]  = 2;
        challengeRating[6]  = 3;
        challengeRating[7]  = 4;
        challengeRating[8]  = 5;
        challengeRating[9]  = 6;
        challengeRating[10] = 7;
        challengeRating[11] = 8;
        challengeRating[12] = 9;
        challengeRating[13] = 10;
        challengeRating[14] = 11;
        challengeRating[15] = 12;
        challengeRating[16] = 13;
        challengeRating[17] = 14;
        challengeRating[18] = 15;
        challengeRating[19] = 16;
        challengeRating[20] = 17;
        challengeRating[21] = 18;
        challengeRating[22] = 19;
        challengeRating[23] = 20;
        challengeRating[24] = 21;
        challengeRating[25] = 22;
        challengeRating[26] = 23;
        challengeRating[27] = 24;
        challengeRating[28] = 25;
        challengeRating[29] = 26;
        challengeRating[30] = 27;
        challengeRating[31] = 28;
        challengeRating[32] = 29;
        challengeRating[33] = 30;
    }

    public double[] getCR()
    {
        makeCR();
        return challengeRating;
    }

    public boolean isBetween(int value)
    {
        boolean flag = false;
        if (value >= 2 & value <= 9)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }

    public int getArrayPosition(int value)
    {
        for (int i = 0; i < challengeRating.length; i++)
        {
            if (value == challengeRating[i])
            {
                arrayPosition = i;
            }
        }
        return arrayPosition;
    }
}
