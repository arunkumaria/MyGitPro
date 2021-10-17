class N4pattern16
{



    public static void main(String[] args){

        int r=9;
        int n=1;
        int spc=4;
       

        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");

            }
        
            for(int k=1;k<=n;k++)
            {

                System.out.print(k);
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