class N4pattern13
{



    public static void main(String[] args){

        int r=5;
        int n=0;
        int spc=4;

        for(int i=1;i<=r;i++)
        {
           
            for(int k=1;k<=spc;k++)
            {

                System.out.print(" ");
            }
            if(n == 0)
            {
                System.out.print(1);
            }
        
            else if(n == 1)
            {
                System.out.print(n); 
                System.out.print(" ");
                System.out.print(n);
                
            }
            else if(n == 2)
            {
               
                    System.out.print("1"); 
                    System.out.print(" ");

                    System.out.print(n); 
                     
                    System.out.print(" ");

            
                
                    System.out.print("1");
            }
            else if(n == 3)
            {
                    System.out.print("1");

                    System.out.print(" ");

                    System.out.print(n);

                    System.out.print(" ");
                    
                    System.out.print(n);

                    System.out.print(" ");

                    System.out.print("1");

            }

            else
            {
                    System.out.print("1");

                    System.out.print(" ");

                    System.out.print(n);

                    System.out.print(" ");
                    
                    System.out.print(n+2);

                    System.out.print(" ");

                    System.out.print(n);

                    System.out.print(" ");

                    System.out.print("1");

            }
            System.out.println();
            n++;
            spc--;

        }
    }
}