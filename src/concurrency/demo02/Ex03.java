package concurrency.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java编程思想：并发部分练习三
 * @author long
 *
 */
public class Ex03 {

	private static class Ex3RunnerA implements Runnable{

		public Ex3RunnerA() {
			System.out.println("Constructing Ex3RunnerA");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex3RunnerA");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex3RunnerA task complete");
		}
	}

	private static class Ex3RunnerB implements Runnable{

		public Ex3RunnerB() {
			System.out.println("Constructing Ex3RunnerB");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex3RunnerB");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex3RunnerB task complete");
		}
	}
	
	private static class Ex3RunnerC implements Runnable{

		public Ex3RunnerC() {
			System.out.println("Constructing Ex3RunnerC");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex3RunnerC");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex3RunnerC task complete");
		}
	}
	
	
	/**
	 * 制定的执行流程
	 * @param exec
	 */
	private static void consumer(ExecutorService exec) {
		
		//添加任务
		exec.execute(new Ex3RunnerA());
		exec.execute(new Ex3RunnerB());
		exec.execute(new Ex3RunnerC());
		
		//任务添加结束，可以执行了
		exec.shutdown();
	}
	
	public static void main(String[] args) {
		
//		consumer(Executors.newCachedThreadPool());
//		consumer(Executors.newFixedThreadPool(3));
		consumer(Executors.newSingleThreadExecutor());
		
		System.out.println("I`m main Thread!");
	}
}
