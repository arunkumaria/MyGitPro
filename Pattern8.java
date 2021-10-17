class Pattern8
{

    public static void main(String[] args)
    {

        int str=1;
        int strack=1;
        int r=5;


        for(int i=1;i<=r;i++)
        {

            for(int j=1;j<=str;j++)
            {

                System.out.print("*");
            }
            System.out.println();
            /*str++;
            strack++;
            if(strack > 3)
            {

                str--;
                str--;
            }*/


            if(i <= r/2)
            {

                str++;
            }         
            else
            {
                str--;
            }  
            
        }
    }
}