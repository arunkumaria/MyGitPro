class N4pattern10
{



    public static void main(String[] args){

        int r=5;
        int n=1;

        for(int i=0;i<r;i++)
        {
           
            n=n+i;
            for(int k=n;k <= (n+i);k++)
            {

                System.out.print(k);

            }
           
            
            System.out.println();


        }
    }
}