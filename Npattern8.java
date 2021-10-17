class Npattern8
{


    public static void main(String[] args){

        int r=7;
        int n=1;
        int m=0;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=1;k<=n;k++)
            {

                System.out.print(k);
            }
            for(int l=n-1;l>=1 && m>0;l--)
            {
                System.out.print(l);
            }
            System.out.println();
            n++;
            m++;
           
            
         
        }
    }
}