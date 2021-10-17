class Apattern26
{



    public static void main(String[] args){

        int r=5;
        int n=65;
       

        for(int i=0;i<r;i++)
        {

          
            n+=i;

            if(i==1 || i==3)
            {
                for(int k=n;k<=(n+i);k++)
                {
               

                    System.out.print((char)k);

                }
            }
            else
            {

                for(int k=(n+i);k>=n;k--)
                {
               

                    System.out.print((char)k);

                }
            }
            System.out.println();
            

        }
    }
}