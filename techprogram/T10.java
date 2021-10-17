class T10
{

    static char[] rstr(char[] m,int l,int i)
    {
        char temp;
        if(i < l/2)
        {
            temp=m[i];
            m[i]=m[l-i-1];
            m[l-i-1]=temp;
            i++;
            rstr(m,l,i);


        }
        return m;
    }

    public static void main(String[] args){


        String n="azam";
        char m[]=n.toCharArray();
        int l=m.length;
        int i=0;
        System.out.println(rstr(m,l,i));
    }
}