class Npattern14
{


    public static void main(String[] args){

        int r=7;
        int n=0;

        for(int i=1;i<=r;i++)
        {

            for(int j=0;j<=6;j++)
            {

                if(j == n)
                {

                    System.out.print(n);
                }
                else
                {
                    System.out.print(0);
                }
            }

            System.out.println();
            n++;

        }
    
                    
    }
}