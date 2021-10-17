class T16
{

    static void perfectn(int n)
    {
        int sum=0,i=1;
        while(i<=(n/2))
        {

            
            if(n % i == 0)
            {

                sum=sum+i;
            }
            i++;
    

        }

        if(sum == n)
        {
             System.out.println("perfect");

        }
        else
        {

             System.out.println("not perfect");
        }
    }

    public static void main(String[] args){


        int n=6;
        perfectn(n);
    }
}