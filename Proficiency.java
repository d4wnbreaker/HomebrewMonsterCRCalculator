public class Proficiency
{
    private int[] proficiency = new int[34];

    public void makeProficiency()
    {
        proficiency[0] = 2;
        proficiency[1] = 2;
        proficiency[2] = 2;
    }

    public int[] getProficiency(int i)
    {
        return proficiency[i];
    }
}
