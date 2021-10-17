class T7
{

    static int nfact(int n)
    {


        if(n == 0)
        {

            return 1;
        }
        else
        {

            return (n*nfact(n-1));
        }
    }

    public static void main(String[] args){


        int n=3;
        System.out.println("factorial="+nfact(n));
    }
}