class T14
{

    

    public static void main(String[] args){


        int a[]={1,3,5,6,2};
        int n=a.length;
        int temp=0;
        
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
       
        System.out.println("largest="+a[n-1]);
    
     
    }
}