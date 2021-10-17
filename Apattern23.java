class Apattern23
{



    public static void main(String[] args){

        int r=6;
        int n=65;
        int spc=5;
       

        for(int i=1;i<=r;i++)
        {

            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }

            for(int k=1;k<=i;k++)
            {

                System.out.print((char)n);
                System.out.print(" ");

            }
            n++;
            spc--;

            System.out.println();
            

        }
    }
}