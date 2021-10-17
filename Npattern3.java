class Npattern3
{


    public static void main(String[] args){

        int r=13;
        int n=1;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=1;k<=n;k++)
            {

                System.out.print(k);
            }
            System.out.println();
            if(i <= r/2)
            {
                n++;
            }
            else
            {
                n--;
            }
            
         
        }
    }
}