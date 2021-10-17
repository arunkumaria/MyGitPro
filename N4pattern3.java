class N4pattern3
{



    public static void main(String[] args){

        int r=9;
        int n=1;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=1;k<=n;k++)
            {

                System.out.print(k);

            }
            if(i <= r/2)
            { 

                n++;
            }
            else
            {
                n--;
            }
            System.out.println();


        }
    }
}