class Apattern20
{



    public static void main(String[] args){

        int r=6;
        int n=65;
        int p=64;
        int spc=5;
       

        for(int i=1;i<=r;i++)
        {

            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }

            for(int k=65;k<=n;k++)
            {

                System.out.print((char)k);

            }

            if(i > 1)
            {
        
                for(int k=p;k>=65;k--)
                {

                    System.out.print((char)k);

                }
            }
            n++;
            p++;
            spc--;

            System.out.println();
            

        }
    }
}