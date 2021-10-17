class Apattern28
{



    public static void main(String[] args){

        int r=5;
        int n=3;
        int p=4;
       

        for(int i=0;i<r;i++)
        {

        

            for(int k=65;k<=(65+p);k++)
            {
               

                System.out.print((char)k);

            }

            for(int k=(65+n);k>=65;k--)
            {
               

                System.out.print((char)k);

            }
            p--;
            n--;
            System.out.println();
            

        }
    }
}