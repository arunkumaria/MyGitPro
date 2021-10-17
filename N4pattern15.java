class N4pattern15
{



    public static void main(String[] args){

        int r=5;
        int n=5;
        int spc=0;
       

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
            

            n--;
            spc++;
            System.out.println();


        }
    }
}