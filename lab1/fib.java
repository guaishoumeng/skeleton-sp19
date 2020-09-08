public class fib{
	public static int fib(int n){
		if(n <= 1) {
			return n;
		}else {
			return fib(n-1) + fib(n-2);
		}
		/**
		int i = 1, prepre = 0, pre = 1, answer = 0 ;
		while( i < n) {
			answer = prepre + pre;
			prepre = pre;
			pre = answer;
			i++;
		}
		return answer;
		*/
	}

	public static int fib2(int n, int k, int f0, int f1) {
		//k indicates the index
		if (n == k){
			return f0;
		}else {
			return fib2(n, k + 1, f1, f0 + f1);
		}

	}
	public static void main (String[] args){
		System.out.println(fib2(9,0,0,1));
	}
}