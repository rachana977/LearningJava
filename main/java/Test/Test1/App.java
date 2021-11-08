package Test.Test1;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Function<Integer,Integer> function =i->{
        	if(i<10) {
        		System.out.println("Here1");
        		return i*i+10;
        	}
        	else {
        		return i*i;
        	}
        };
        
        System.out.println("Here");
        System.out.println(function.apply(8));
        
    }
}
