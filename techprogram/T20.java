class T20
{

    static void utol(String str){

        char[] chr=str.toCharArray();
        int i=0,n=chr.length;

        System.out.println("upper case ");
        while(i<n)
        {

            System.out.print(chr[i]);
            i++;
        }  

        i=0;
        while(i < n)
        {

            if(chr[i] >= 65 && chr[i] <= 90)
            {
                chr[i] = (char)((int)chr[i] + 32);
            }
            i++;
        } 
        System.out.println();
      
        System.out.println("lower case ");
        i=0;
        while(i<n)
        {

            System.out.print(chr[i]);
            i++;
        }  

     
        
    }

    public static void main(String[] args){


        String str="AZAM";
        utol(str);
    }
}