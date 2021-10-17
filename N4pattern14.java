class N4pattern14
{



    public static void main(String[] args){

        int r=5;
        int n=1;
        int p=0;
       

        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=n;k++)
            {

                System.out.print(k);

            }
           
            if(i > 1)
            {
                for(int k=p;k>=1;k--)
                {

                    System.out.print(k);

                }
            }
            

            n++;
            p++;
            System.out.println();


        }
    }
}