class N2pattern1
{



    public static void main(String[] args)
    {

        int r=5;
        int spc=4;
        int n=1;

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=spc;j++)
            {

                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
            
                System.out.print(k); 

            }

            for(int l=n-1;l>=1;l--)
            {

                 System.out.print(l); 
            }
            System.out.println();
            spc--;
            n++;

        }
    }
}