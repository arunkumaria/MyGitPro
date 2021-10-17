class Npattern13
{


    public static void main(String[] args){

        int r=5;
        int n=1;
        int j;
        int m;

        for(int i=1;i<=r;i++)
        {
    
                    j=n;
                    for(int k=i;k<=n;)
                    {
                        if(k == 1)
                        {
                            System.out.print(k);
                            k+=5;
                        }
                        else if(k == 2 || k == 6) 
                        {
                            if(k == 2)
                            {
                                System.out.print(k);
                                k+=4;
                                n+=4;
                            }
                            else
                            {
                                
                                 System.out.print(k);
                                 k-=4;
                                 n-=4;
                                 k++;
                                
                            }
                           
                        }
                        else if(k == 3 || k == 7 || k == 10)
                        {
                            if(k == 3)
                            {
                                System.out.print(k);
                                k+=4;
                                n+=4;
                            }
                            else if(k == 7)
                            {
                                
                                System.out.print(k);
                                k+=3;
                                n+=3;
                            }
                            else
                            {
                                System.out.print(k);
                                k-=7;
                                n-=7;
                                k++;
                               
                        

                            }
                        }
                       else if(k == 4 || k == 8 || k == 11 || k == 13)
                        {
                            if(k == 4)
                            {
                                System.out.print(k);
                                k+=4;
                                n+=4;
                            }
                            else if(k == 8)
                            {
                                
                                System.out.print(k);
                                k+=3;
                                n+=3;
                            }
                            else if(k == 11)
                            {
                                System.out.print(k);
                                k+=2;
                                n+=2;
                            }
                            else
                            {
                                System.out.print(k);
                                k-=9;
                                n-=9;
                                k++;
                            

                            }
                        }
                        else
                        {
                             if(k == 5)
                            {
                                System.out.print(k);
                                k+=4;
                                n+=4;
                            }
                            else if(k == 9)
                            {
                                
                                System.out.print(k);
                                k+=3;
                                n+=3;
                            }
                            else if(k == 12)
                            {
                                System.out.print(k);
                                k+=2;
                                n+=2;
                            }
                            else if(k == 14)
                            {
                                System.out.print(k);
                                k++;
                                n++;

                            }
                            else
                            {
                                System.out.print(k);
                                break; 


                            }



                        }
                    }
                    n=j;
                    System.out.println();
                    n++;
           
            
         
        }
    }
}