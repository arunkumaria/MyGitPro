class N2pattern10
{



    public static void main(String[] args){

        int r=7;
        int n=1;
        int str=6;

        for(int i=1;i<=r;i++)
        {
           
            for(int k=1;k<=n;k++)
            {

                System.out.print(k);
            }
        
       
            for(int k=1;k<=str;k++)
            {

                System.out.print("*");
            }
            System.out.println();
            n++;
            str--;

        }
    }
}