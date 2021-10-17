class N4pattern5
{



    public static void main(String[] args){

        int r=10;
        int n=5;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=n;k>=1;k--)
            {

                System.out.print(k);

            }
            if(i <= r/2)
            { 

                n--;
            }
            else
            {
                n++;
            }

            if(n == 0)
            {

                n++;
            }
            System.out.println();


        }
    }
}