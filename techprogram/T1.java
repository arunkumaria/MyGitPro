class T1
{

    public static void main(String[] args){


        int a=-9,b=83,c;

        if(a == b)
        {
             System.out.println("rem="+0);
        }
        else if(a < b)
        {
             System.out.println("rem="+a);

        }
        else
        {
            c=a-b;
            while(c >= b)
            {
                c-=b;

            }

            System.out.println("rem="+c);
        }
    }
}