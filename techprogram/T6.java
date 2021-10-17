class T6
{

    public static void main(String[] args){


        String a="allah";
        char b[]=a.toCharArray();
        int count=1;

        for(int i=0;i<b.length;i++)
        {
            
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i] == b[j])
                {

                    count++;
                }
                if(count > 1)
                {

                    System.out.print(b[i]);
                    count=1;
                }

            }
        }
    }
}