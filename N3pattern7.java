class N3pattern7
{



    public static void main(String[] args){

        int r=4;
        int str=7;
        int spc=0;

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
            spc++;
            str-=2;
            System.out.println();


        }
    }
}