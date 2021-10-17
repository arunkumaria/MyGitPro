class N3pattern10
{



    public static void main(String[] args){

        int r=8;
        int str=1;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=1;k<=str;k++)
            {

                System.out.print("*");

            }
            System.out.print(" ");
            for(int k=1;k<=str;k++)
            {

                System.out.print("*");

            }

            str++;
            System.out.println();


        }
    }
}