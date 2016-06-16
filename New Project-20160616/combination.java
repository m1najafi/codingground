public class HelloWorld{
    public static int combination(int k, int n){
        if (k>n-k)
            k=n-k;
 
        long b=1;
        for (int i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
        return (int)b;    
        
    }

     public static void main(String []args){
        
        System.out.println("Hello World");
        System.out.println(combination(2,5));
     }
}
