class N2pattern5
{



    public static void main(String[] args)
    {

        int r=5;
        int n=1;

        for(int i=1;i<=r;i++)
        {
            
            if(i % 2 == 0)
            {
                for(int l=1;l<=n;l++)
                {
                    if(l % 2 == 0)
                    {
                        System.out.print(1); 
                    }
                    else
                    {
                        System.out.print(0);
                    }
                }


            }
            else
            {
                for(int l=1;l<=n;l++)
                {
                    if(l % 2 == 0)
                    {
                        System.out.print(0); 
                    }
                    else
                    {
                        System.out.print(1);
                    }
                }
            }

            System.out.println();
            n++;

        }
    }
}