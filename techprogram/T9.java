class T9
{

    static void palindrome(int n)
    {
        int temp=n,r,sum=0;
        while(n>0)
        {

            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }

        if(sum == temp)
        {
             System.out.println("palindrome");

        }
        else
        {

             System.out.println("not palindrome");
        }
    }

    public static void main(String[] args){


        int n=122;
        palindrome(n);
    }
}