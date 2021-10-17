class Apattern19
{



    public static void main(String[] args){

        int r=6;
        int spc=5;
        int n=70;
       

        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }
        
            for(int k=n;k<=70;k++)
            {

                System.out.print((char)k);
                System.out.print(" ");

            }
            n--;
            spc--;
            System.out.println();


        }
    }
}