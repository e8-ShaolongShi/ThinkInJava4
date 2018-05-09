package concurrency.demo01;

class FibonacciA implements Runnable {
	private int count;

	public FibonacciA(int n) {
		count = n;
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0; i<count; i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
	}
}
class FibonacciB implements Runnable {
	private int count;
	
	public FibonacciB(int n) {
		count = n;
	}
	
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0; i<count; i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
	}
}
class FibonacciC implements Runnable {
	private int count;
	
	public FibonacciC(int n) {
		count = n;
	}
	
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0; i<count; i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
	}
}
class FibonacciD implements Runnable {
	private int count;
	
	public FibonacciD(int n) {
		count = n;
	}
	
	/**
	 * 打印斐波那契数列第你位的数字  ，每一位都是通过计算得到的
	 * @param n 位    ，其实是索引
	 * @return
	 */
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0; i<count; i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
	}
}

/**
 * Th4:concurrency/Ex2
 * 
 * @author long
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		new Thread(new FibonacciA(15)).start();;
		new Thread(new FibonacciB(20)).start();;
		new Thread(new FibonacciC(15)).start();;
		new Thread(new FibonacciD(10)).start();;
	}
}
