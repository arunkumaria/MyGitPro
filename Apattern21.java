class Apattern21
{



    public static void main(String[] args){

        int r=6;
        int a=65;
        int n=5;
        int j=0;
       

        for(int i=1;i<=r;i++)
        {

            for(int k=1;k<=n;k++)
            {

                System.out.print((char)a);

            }
        
        
            for(int k=1;k<=j+1;k++)
            {
                

                System.out.print((char)(a+j));

            }
            j++;
            n--;
            
            System.out.println();
            

        }
    }
}