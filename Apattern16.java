class Apattern16
{



    public static void main(String[] args){

        int r=11;
        int spc=5;
        int n=65;
       

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
            
            if(i <= r/2)
            {
                n++;
                spc--;
            }
            else
            {
                n--;
                spc++;

            }
            System.out.println();


        }
    }
}