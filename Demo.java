class Demo
{


    public static void main(String[] args)
    {


        String str="azam amir reza";


        String[] str1=str.split(" ");
    


        for(int i=0;i<str1.length;i++)
        {


            String str2=str1[i];
            char[] carr=str2.toCharArray();
           for(int j=carr.length-1;j>=0;j--)
            {
                System.out.print(carr[j]);

            }
            System.out.print(" ");
        }
    } 
}