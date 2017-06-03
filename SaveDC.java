public class SaveDC
{
    private int[] saveDC = new int[34];

    public void makeSaveDC()
    {
        saveDC[0]  = 13;
        saveDC[1]  = 13;
        saveDC[2]  = 13;
        saveDC[3]  = 13;
        saveDC[4]  = 13;
        saveDC[5]  = 13;
        saveDC[6]  = 13;
        saveDC[7]  = 14;
        saveDC[8]  = 15;
        saveDC[9]  = 15;
        saveDC[10] = 15;
        saveDC[11] = 16;
        saveDC[12] = 16;
        saveDC[13] = 16;
        saveDC[14] = 17;
        saveDC[15] = 17;
        saveDC[16] = 18;
        saveDC[17] = 18;
        saveDC[18] = 18;
        saveDC[19] = 18;
        saveDC[20] = 19;
        saveDC[21] = 19;
        saveDC[22] = 19;
        saveDC[23] = 19;
        saveDC[24] = 20;
        saveDC[25] = 20;
        saveDC[26] = 20;
        saveDC[27] = 21;
        saveDC[28] = 21;
        saveDC[29] = 21;
        saveDC[30] = 22;
        saveDC[31] = 22;
        saveDC[32] = 22;
        saveDC[33] = 23;
    }

    public int[] getSaveDC()
    {
        makeSaveDC();
        return saveDC;
    }

    public boolean isBetween(int value)
    {
        boolean flag = false;
        if (value >= 13 & value <= 23)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
}
