class T21
{

    static void camel(String str){


        char[] chr=str.toCharArray();
        int i=0,n=chr.length;

        while(i < n)
        {
            if(i == 0)
            {

                chr[i]=(char)((int)chr[i]-32);
            }

            if(chr[i] == 32)
            {

                chr[i+1]=(char)((int)chr[i+1]-32);
            }


            i++;
        }
        i=0;
        System.out.println("camel case converted string");
        while(i < n)
        {
            System.out.print(chr[i]);
            i++;

        }
      

     
        
    }

    public static void main(String[] args){


        String str="azam amir reza";
        System.out.println("given string");
        System.out.println(str);
        camel(str);
    }
}