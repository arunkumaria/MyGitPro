class T13
{

    

    public static void main(String[] args){


        int a[]={4,3,5,1,2};
        int n=a.length;
        int temp;
        
        for(int i=0;i<n-1;i++)
        {

            for(int j=0;j<n-i-1;j++)
            {

                if(a[j] > a[j+1])
                {

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]);
    
        }
    }
}