/**
 * 
 */
package basicAlgorithms;

/**
 * @author E
 *
 */
public class Fibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		for(int n = 0; n < 11; n++){
			System.out.println("Fib " + n + " = " + fib(n));
		}
		fib(-1);
	}


	public static int fib(int n){
		if (n < 0){
			throw new IllegalArgumentException("Invalid Entry: Value cannot be negative");
		}
		return fib(n, new int[n]);
	}
	public static int fib(int n, int[] s){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		} 
//		cache(n-1, fib(n - 1, s), s);
		s[n-1] = fib(n - 1, s);
		return  s[n-1] + s[n-2];
	}



	public static void cache(int n, int value, int[] s){
		s[n] = value;
	}
}