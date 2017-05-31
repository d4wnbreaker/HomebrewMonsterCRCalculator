public class AttackBonus
{
    private int[] attackBonus = int [34];

    public void makeAttackBonus()
    {
        attackBonus[0] = 3;
        attackBonus[1] = 3;
        attackBonus[2] = 3;
        attackBonus[3] = 3;
        attackBonus[4] = 3;
        attackBonus[5] = 3;
        attackBonus[6] = 4;
        attackBonus[7] = 5;
        attackBonus[8] = 6;
        attackBonus[9] = 6;
        attackBonus[10] = 6;
        attackBonus[11] = 7;
        attackBonus[12] = 7;
        attackBonus[13] = 7;
        attackBonus[14] = 8;
        attackBonus[15] = 8;
        attackBonus[16] = 8;
        attackBonus[17] = 8;
        attackBonus[18] = 8;
        attackBonus[19] = 9;
        attackBonus[20] = 10;
        attackBonus[21] = 10;
        attackBonus[22] = 10;
        attackBonus[23] = 10;
        attackBonus[24] = 11;
        attackBonus[25] = 11;
        attackBonus[26] = 11;
        attackBonus[27] = 12;
        attackBonus[28] = 12;
        attackBonus[29] = 12;
        attackBonus[30] = 13;
        attackBonus[31] = 13;
        attackBonus[32] = 13;
        attackBonus[33] = 14;
    }

    public int[] getAttackBonus()
    {
        makeAttackBonus();
        return attackBonus;
    }
}
