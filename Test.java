public class Test
{
    public class Thingie
    {
        private int hold;
        private int[] array = new int[6];

        public void makeArray()
        {
            for (int i = 0; i < array.length; i++)
            {
                array[i] = i;
            }
        }

        public void getPosition(int value)
        {
            for (int i = 0; i < array.length; i++)
            {
                if (value == array[i])
                {
                    hold = i;
                }
            }
            // return actualCR;
        }
    }

    public static void main(String[] args)
    {
        Thingie thingie = new Thingie();

        System.out.println(hold);
    }
}
