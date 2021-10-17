class T8
{

    static void armstr(int n)
    {
        int temp=n,r,sum=0;
        while(n>0)
        {

            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;

        }

        if(sum == temp)
        {
             System.out.println("armstrong");

        }
        else
        {

             System.out.println("not armstrong");
        }
    }

    public static void main(String[] args){


        int n=154;
        armstr(n);
    }
}