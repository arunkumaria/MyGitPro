class N3pattern8
{



    public static void main(String[] args){

        int r=9;
        int str=1;
        int spc=4;

        for(int i=1;i<=r;i++)
        {
           
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");
            }

            for(int k=1;k<=str;k++)
            {

                System.out.print("*");

            }
            if(i <= r/2)
            {
                spc--;
                str+=2;
            }
            else
            {
                spc++;
                str-=2; 
            }
            System.out.println();


        }
    }
}