
/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( " Prime: "+isPrime(23434531) );
        System.out.println( " Factorial: "+factorial(5) );
    }
    
    
    public static boolean isPrime(int p){
    	for(int i=2;i*i<=p;i++){
    		if(p%i==0){
    			return false;
    		}
    	}
    	return true;
    }
    
    public static int factorial(int n){
    	if(n==0){
    		return 1;
    	}else if(n>0){
    		return n * factorial(n-1);
    	}
    	return -1;
    }
}
