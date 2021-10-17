class Apattern24
{



    public static void main(String[] args){

        int r=4;
        int n=1;
        int spc=3;
        int p=74;
       

        for(int i=1;i<=r;i++)
        {

            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }

            for(int k=1;k<=n;k++)
            {
                if(n == 5)
                {
                    p=86;
                }
                else if(n == 7)
                {

                    p=65;
                }

                System.out.print((char)p);

            }
            n+=2;
            p-=9;
            spc--;

            System.out.println();
            

        }
    }
}