class N3pattern9
{



    public static void main(String[] args){

        int r=7;
        int str=1;

        for(int i=1;i<=r;i++)
        {
           

            for(int k=1;k<=str;k++)
            {

                System.out.print("*");

            }
            if(i <= r/2)
            {
                
                str++;
            }
            else
            {
                
                str--; 
            }
            System.out.println();


        }
    }
}