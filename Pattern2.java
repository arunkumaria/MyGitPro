class Pattern2
{

    public static void main(String[] args){

        int str=1;
        int r=3;


        for(int i=1;i<=r;i++)
        {

            for(int j=1;j<=str;j++)
            {

                System.out.print("*");
            }
            System.out.println();
            str++;
        }
    }
}