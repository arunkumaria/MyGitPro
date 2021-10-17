class Apattern22
{



    public static void main(String[] args){

        int r=6;
        int n=65;
       

        for(int i=1;i<=r;i++)
        {

            for(int k=n;k<=70;k++)
            {

                System.out.print((char)k);

            }
        
        
            for(int k=69;k>=n;k--)
            {
                

                System.out.print((char)k);

            }
            n++;
            
            System.out.println();
            

        }
    }
}