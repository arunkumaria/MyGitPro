class T17
{

    static void neon(int n)
    {
        int temp=n,r,sum=0;
        n=n*n;
        while(n>0)
        {

            r=n%10;
            sum=sum+r;
            n=n/10;

        }

        if(sum == temp)
        {
             System.out.println("neon");

        }
        else
        {

             System.out.println("not neon");
        }
    }

    public static void main(String[] args){


        int n=9;
        neon(n);
    }
}