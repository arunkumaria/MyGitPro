class Npattern12
{


    public static void main(String[] args){

        int r=7;
        int n=1;

        for(int i=1;i<=r;i++)
        {
    
                if(i % 2 == 0)
                {   
                    for(int k=1;k<=r;k++)
                    {
                        if(k % 2 == 0)
                        {
                            System.out.print(1);
                        }
                        else
                        {

                            System.out.print(0);
                        }
                    }
                }
                else
                {
                     for(int k=1;k<=r;k++)
                    {
                        if(k % 2 == 0)
                        {
                            System.out.print(0);
                        }
                        else
                        {

                            System.out.print(1);
                        }
                    }
                } 
                System.out.println();
           
            
         
        }
    }
}