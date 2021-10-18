class Dem4
{


    public static void main(String[] args)
    {


        String str="All India Radio";


        String[] str1=str.split(" ");
    


        for(int i=0;i<str1.length;i++)
        {


            String str2=str1[i];
            char[] carr=str2.toCharArray();

           for(int j=0;j<=carr.length-1;j++)
            {
                if(j==0)
                {
                    System.out.print(carr[j]);
                }
            }
        }
    } 
}