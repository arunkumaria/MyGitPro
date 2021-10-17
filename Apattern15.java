class Apattern15
{



    public static void main(String[] args){

        int r=6;
        int spc=0;
        int n=70;
       

        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }
        
            for(int k=65;k<=n;k++)
            {

                System.out.print((char)k);
                System.out.print(" ");

            }
            

            n--;
            spc++;
            System.out.println();


        }
    }
}