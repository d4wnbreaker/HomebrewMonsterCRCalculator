public class DamagePerRound
{
    private int[] damagePerRound = new int[68];
    private int arrayPosition;

    public void makeDamagePerRound()
    {
        damagePerRound[0]   = 0;
        damagePerRound[1]   = 1;
        damagePerRound[2]   = 2;
        damagePerRound[3]   = 3;
        damagePerRound[4]   = 4;
        damagePerRound[5]   = 5;
        damagePerRound[6]   = 6;
        damagePerRound[7]   = 8;
        damagePerRound[8]   = 9;
        damagePerRound[9]   = 14;
        damagePerRound[10]  = 15;
        damagePerRound[11]  = 20;
        damagePerRound[12]  = 21;
        damagePerRound[13]  = 26;
        damagePerRound[14]  = 27;
        damagePerRound[15]  = 32;
        damagePerRound[16]  = 32;
        damagePerRound[17]  = 33;
        damagePerRound[18]  = 38;
        damagePerRound[19]  = 39;
        damagePerRound[20]  = 44;
        damagePerRound[21]  = 45;
        damagePerRound[22]  = 50;
        damagePerRound[23]  = 51;
        damagePerRound[24]  = 56;
        damagePerRound[25]  = 62;
        damagePerRound[26]  = 63;
        damagePerRound[27]  = 68;
        damagePerRound[28]  = 69;
        damagePerRound[29]  = 74;
        damagePerRound[30]  = 75;
        damagePerRound[31]  = 80;
        damagePerRound[32]  = 81;
        damagePerRound[33]  = 86;
        damagePerRound[34]  = 87;
        damagePerRound[35]  = 92;
        damagePerRound[36]  = 93;
        damagePerRound[37]  = 98;
        damagePerRound[38]  = 99;
        damagePerRound[39] = 104;
        damagePerRound[40] = 105;
        damagePerRound[41] = 110;
        damagePerRound[42] = 111;
        damagePerRound[43] = 116;
        damagePerRound[44] = 117;
        damagePerRound[45] = 122;
        damagePerRound[46] = 123;
        damagePerRound[47] = 140;
        damagePerRound[48] = 141;
        damagePerRound[49] = 158;
        damagePerRound[50] = 159;
        damagePerRound[51] = 176;
        damagePerRound[52] = 177;
        damagePerRound[53] = 194;
        damagePerRound[54] = 195;
        damagePerRound[55] = 212;
        damagePerRound[56] = 213;
        damagePerRound[57] = 230;
        damagePerRound[58] = 231;
        damagePerRound[59] = 248;
        damagePerRound[60] = 249;
        damagePerRound[61] = 266;
        damagePerRound[62] = 267;
        damagePerRound[63] = 284;
        damagePerRound[64] = 285;
        damagePerRound[65] = 302;
        damagePerRound[66] = 303;
        damagePerRound[67] = 320;
    }

    public int[] getDamagePerRound()
    {
        makeDamagePerRound();
        return damagePerRound;
    }

    public boolean isBetween(double value)
    {
        boolean flag = false;
        if (value <= 320)
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
        for (int i = 0; i < damagePerRound.length; i++)
        {
            if (value == damagePerRound[i])
            {
                arrayPosition = i;
            }
        }
        return arrayPosition;
    }
}
