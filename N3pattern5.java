class N3pattern5
{



    public static void main(String[] args){

        int r=6;
        int str=1;
        int spc=5;

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
            spc--;
            str++;
            System.out.println();


        }
    }
}