class Apattern18
{



    public static void main(String[] args){

        int r=12;
        int spc=0;
        int n=65;
       

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
            
            
            if(i <= r/2)
            {
                n++;
                spc++;
            }
            else
            {
                n--;
                spc--;

            }

            if(n == 71)
            {
                n=70;
                spc--;
            }

            
            System.out.println();


        }
    }
}