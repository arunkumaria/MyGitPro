class T15
{

    static void strongn(int n)
    {
        int temp=n,r,sum=0,f=1,i=1;
        while(n>0)
        {

            r=n%10;
            while(i <= r)
            {

                f=f*i;
                i++;
            }
            i=1;
            sum=sum+f;
            f=1;
            n=n/10;

        }

        if(sum == temp)
        {
             System.out.println("strong");

        }
        else
        {

             System.out.println("not strong");
        }
    }

    public static void main(String[] args){


        int n=145;
        strongn(n);
    }
}