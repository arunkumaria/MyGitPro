class T19
{

    static void countstr(String str){

        char[] chr=str.toCharArray();

        int n=chr.length,i=0,vc=0,coc=0,sc=0,wc=0;

        while(i < n)
        {

            if(chr[i] == 'a'||chr[i] == 'e'||chr[i] == 'i'||chr[i] == 'o'||chr[i] == 'u')
            {
                    vc++;

            }

            else if(chr[i] >= (char)48 && chr[i] <= (char)57)
            {
                    coc++;

            }

            else if((chr[i] >= (char)32 && chr[i] <= (char)47) || (chr[i] >= (char)58 && chr[i] <= (char)64) || (chr[i] >= (char)91 && chr[i] <= (char)96)|| (chr[i] >= (char)123 && chr[i] <= (char)126))
            {
                if(chr[i] == (char)32)
                {
                    wc++;
                }

                sc++;
            }

            i++;
          
 
 
        }
      

        System.out.println("vowel count= "+vc);  
        System.out.println("char count= "+n);
        System.out.println("constant count= "+coc);
        System.out.println("special count= "+sc);
        System.out.println("word count= "+(wc+1));    
      
     
        
    }

    public static void main(String[] args){


        String str="hi how are you!!34";
        countstr(str);
    }
}