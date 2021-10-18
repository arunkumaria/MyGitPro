/*to print the no of occurrences*/

class Demo1
{


    public static void main(String[] args){
        String str="azama";
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
            System.out.println(cArr[i]+"="+count+"times");
            
        }

       



    }
}