package concurrency.demo02;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FibonacciA implements Callable<Integer> {
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
	public Integer call() throws Exception {

		int result = 0;
		for(int i=0; i<count; i++) {
			int fib = fib(i);
			result+=fib;
			System.out.print(fib+" ");
		}
		System.out.println();
		return result;
	}
}

class FibonacciB implements Callable<Integer> {
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
	public Integer call() throws Exception {
		
		int result = 0;
		for(int i=0; i<count; i++) {
			int fib = fib(i);
			result+=fib;
			System.out.print(fib+" ");
		}
		System.out.println();
		return result;
	}
}

class FibonacciC implements Callable<Integer> {
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
	public Integer call() throws Exception {
		
		int result = 0;
		for(int i=0; i<count; i++) {
			int fib = fib(i);
			result+=fib;
			System.out.print(fib+" ");
		}
		System.out.println();
		return result;
	}
}

class FibonacciD implements Callable<Integer> {
	private int count;
	
	public FibonacciD(int n) {
		count = n;
	}
	
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
	
	@Override
	public Integer call() throws Exception {
		
		int result = 0;
		for(int i=0; i<count; i++) {
			int fib = fib(i);
			result+=fib;
			System.out.print(fib+" ");
		}
		System.out.println();
		return result;
	}
}

/**
 * Th4:concurrency/Ex4
 * 
 * @author long
 *
 */
public class Ex04 {
	
	/**
	 * 测试流程
	 * @param exec：执行器
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	private static void consumer(ExecutorService exec){
		
		ArrayList<Future<Integer>> results = new ArrayList<>();
		
		results.add(exec.submit(new FibonacciA(10)));
		results.add(exec.submit(new FibonacciB(11)));
		results.add(exec.submit(new FibonacciC(12)));
		results.add(exec.submit(new FibonacciD(13)));
		
		for (Future<Integer> fs : results) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				System.out.println(e);
			}
		}
		
		exec.shutdown();
	}
	
	public static void main(String[] args) {
		
//		 consumer(Executors.newCachedThreadPool());
//		 consumer(Executors.newFixedThreadPool(4));
		 consumer(Executors.newSingleThreadExecutor());
		
		 System.out.println(Thread.currentThread()+"[finished!!!this is main]");
	}
}
