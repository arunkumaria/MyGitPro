class T18
{

    static void swap(int m,int n){

        System.out.println("before swapping "+"m= "+m+" n= "+n);  
        m=m+n;
        n=m-n;
        m=m-n;
       
        System.out.println("after swapping "+"m= "+m+" n= "+n);  

     
        
    }

    public static void main(String[] args){


        int m=10,n=20;
        swap(m,n);
    }
}