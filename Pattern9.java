class Pattern9
{

    public static void main(String[] args){

        int str=1;
        int r=5;
        int spc=2;


        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=spc;j++)
            {

                System.out.print(" ");
            }

            for(int j=1;j<=str;j++)
            {

                System.out.print("*");
            }
            System.out.println();

            if(i <= r/2)
            {

                str++;
                spc--;
            }         
            else
            {

                str--;
                spc++;
            } 
            
        }
    }
}