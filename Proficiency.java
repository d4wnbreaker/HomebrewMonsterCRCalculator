import java.util.ArrayList;

public class Proficiency
{
    private int[] proficiency = new int[34];
    private ArrayList<Integer> arrayPosition = new ArrayList<Integer>();

    public void makeProficiency()
    {
        proficiency[0]  = 2;
        proficiency[1]  = 2;
        proficiency[2]  = 2;
        proficiency[3]  = 2;
        proficiency[4]  = 2;
        proficiency[5]  = 2;
        proficiency[6]  = 2;
        proficiency[7]  = 2;
        proficiency[8]  = 3;
        proficiency[9]  = 3;
        proficiency[10] = 3;
        proficiency[11] = 3;
        proficiency[12] = 4;
        proficiency[13] = 4;
        proficiency[14] = 4;
        proficiency[15] = 4;
        proficiency[16] = 5;
        proficiency[17] = 5;
        proficiency[18] = 5;
        proficiency[19] = 5;
        proficiency[20] = 6;
        proficiency[21] = 6;
        proficiency[22] = 6;
        proficiency[23] = 6;
        proficiency[24] = 7;
        proficiency[25] = 7;
        proficiency[26] = 7;
        proficiency[27] = 7;
        proficiency[28] = 8;
        proficiency[29] = 8;
        proficiency[30] = 8;
        proficiency[31] = 8;
        proficiency[32] = 9;
        proficiency[33] = 9;
    }

    public int[] getProficiency()
    {
        makeProficiency();
        return proficiency;
    }

    public boolean isBetween(double value)
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

    public ArrayList<Integer> getArrayPosition(int value)
    {
        int j = 0;
        for (int i = 0; i < proficiency.length; i++)
        {
            if (value == proficiency[i])
            {
                arrayPosition.add(i);
                j++;
            }
        }
        return arrayPosition;
    }
}
    // Find a way to track the first and last time that the desired proficiency equals a value in the array ✅
