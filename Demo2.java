/*to remove duplicate*/

class Demo2
{


    public static void main(String[] args){
        String str="azam";
        char[] cArr=str.toCharArray();
        int count;
        int size=cArr.length;
        int sc=1;

        for(int i=0;i<size;i++)
        {
            count=1;
            for(int j=i+1;j<size;j++)
            {

                if(cArr[i] == cArr[j])
                {

                    count++;
                    int k=j;
                    while(k < size-1)
                    {

                        cArr[k]=cArr[k+1];
                        k++;
                       
                        
                    }
                    size--;
                    j--;
                }



            }
           
            
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(cArr[i]);
        }

       



    }
}
