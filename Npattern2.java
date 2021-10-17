class Npattern2
{


    public static void main(String[] args)
    {

        int r=7;
        int n=1;
        int rp=6;

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=rp;j++)
            {

                System.out.print("1");
            }

            for(int k=1;k<=n;k++)
            {

                System.out.print(n);
            }
            System.out.println();
            n++;
            rp--;
        }
    }
}