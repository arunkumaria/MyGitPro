class N3pattern3
{



    public static void main(String[] args){

        int r=5;
        int str=5;
        int spc=0;

        for(int i=1;i<=r;i++)
        {
           
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");
            }

            for(int k=1;k<=str;k++)
            {

                System.out.print("*");
                System.out.print(" ");

            }
            spc++;
            str--;
            System.out.println();


        }
    }
}