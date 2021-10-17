class Apattern25
{



    public static void main(String[] args){

        int r=5;
        int n=65;
       

        for(int i=0;i<r;i++)
        {

          
            n+=i;

            if(i==0 || i==2 || i==4)
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