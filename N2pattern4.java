class N2pattern4
{



    public static void main(String[] args)
    {

        int r=10;
        int n=5;

        for(int i=1;i<=r;i++)
        {
            
        

            for(int l=1;l<=n;l++)
            {

                 System.out.print(l); 
            }
            System.out.println();
            if(i <= r/2)
            {
                n--;
            }
            else
            {
                n++;
            }

            if(n == 0)
            {
                n=1;
            }

        }
    }
}