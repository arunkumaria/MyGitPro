class N4pattern12
{



    public static void main(String[] args){

        int r=5;
        int n=1;
        int p=1;

        for(int i=1;i<=r;i++)
        {
            if(i >= 2 )
            {
                p=n+5;

            }

           
            
            for(int k=n;k <= p ;)
            {

                System.out.print(k);
                k+=5;
                if(i == 3 && k == 13)
                {
                    p+=5;
                }

                if(i == 4 && (k == 14 || k == 19))
                {
                    p+=5;
                }

                if(i == 5 && (k == 15 || k == 20 || k == 25))
                {
                    p+=5;
                }
            }
            n++;
            
            System.out.println();


        }
    }
}