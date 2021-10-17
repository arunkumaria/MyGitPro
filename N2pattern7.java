class N2pattern7
{



    public static void main(String[] args)
    {

        int r=9;
        int n=1;

        for(int i=1;i<=r;i++)
        {
            
        

            for(int l=1;l<=n;l++)
            {

                 System.out.print(l); 
            }
            System.out.println();
            if(i <= r/2)
            {

                n++;
            }
            else
            {
                n--;
            }

        }
    }
}