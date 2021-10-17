class Npattern9
{


    public static void main(String[] args){

        int r=13;
        int n=1;
        int spc=0;

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=spc;j++)
            {

                System.out.print(" ");
            }
           

            for(int k=n;k<=7;k++)
            {

                System.out.print(k);
            }
            System.out.println();
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
           
            
         
        }
    }
}