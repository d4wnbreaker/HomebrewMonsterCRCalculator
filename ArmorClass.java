public class ArmorClass
{
    private int[] armorClass = new int[34];

    public void makeArmorClass()
    {
        armorClass[0]  = 13;
        armorClass[1]  = 13;
        armorClass[2]  = 13;
        armorClass[3]  = 13;
        armorClass[4]  = 13;
        armorClass[5]  = 13;
        armorClass[6]  = 13;
        armorClass[7]  = 13;
        armorClass[8]  = 14;
        armorClass[9]  = 15;
        armorClass[10] = 15;
        armorClass[11] = 15;
        armorClass[12] = 16;
        armorClass[13] = 16;
        armorClass[14] = 17;
        armorClass[15] = 17;
        armorClass[16] = 17;
        armorClass[17] = 18;
        armorClass[18] = 18;
        armorClass[19] = 18;
        armorClass[20] = 18;
        armorClass[21] = 19;
        armorClass[22] = 19;
        armorClass[23] = 19;
        armorClass[24] = 19;
        armorClass[25] = 19;
        armorClass[26] = 19;
        armorClass[27] = 19;
        armorClass[28] = 19;
        armorClass[29] = 19;
        armorClass[30] = 19;
        armorClass[31] = 19;
        armorClass[32] = 19;
        armorClass[33] = 19;
    }

    public int[] getArmorClass()
    {
        makeArmorClass();
        return armorClass;
    }

    public boolean isBetween(int value)
    {
        boolean flag = false;
        if (value >= 13 & value <= 19)
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
