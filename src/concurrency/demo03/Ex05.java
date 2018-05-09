package concurrency.demo03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
 * Th4:concurrency/Ex4
 * 
 * @author long
 *
 */
public class Ex05 {
	
	/**
	 * 测试流程
	 * @param exec：执行器
	 */
	private static void consumer(ExecutorService exec){
		exec.execute(new FibonacciA(14));
		exec.execute(new FibonacciB(14));
		exec.execute(new FibonacciC(14));
		exec.execute(new FibonacciD(14));
		
		exec.shutdown();
	}
	
	public static void main(String[] args) {
		
//		 consumer(Executors.newCachedThreadPool());
//		 consumer(Executors.newFixedThreadPool(4));
		 consumer(Executors.newSingleThreadExecutor());
		
		 System.out.println(Thread.currentThread()+"[finished!!!this is main]");
	}
}
