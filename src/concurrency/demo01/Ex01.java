package concurrency.demo01;

/**
 * 并发的第一个练习题
 * @author long
 *
 */
public class Ex01 {

	private static class Ex1RunnerA implements Runnable{

		public Ex1RunnerA() {
			System.out.println("Constructing Ex1RunnerA");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex1RunnerA");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex1RunnerA task complete");
		}
	}

	private static class Ex1RunnerB implements Runnable{

		public Ex1RunnerB() {
			System.out.println("Constructing Ex1RunnerB");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex1RunnerB");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex1RunnerB task complete");
		}
	}
	
	private static class Ex1RunnerC implements Runnable{

		public Ex1RunnerC() {
			System.out.println("Constructing Ex1RunnerC");
		}
		
		@Override
		public void run() {
			for(int i=0; i<3; i++) {
				System.out.println("Hi from Ex1RunnerC");
				Thread.yield(); //建议线程调度器，我执行完了，你可以切换其他线程执行了
			}
			System.out.println("Ex1RunnerC task complete");
		}
	}
	
	public static void main(String[] args) {
		
		Thread ta = new Thread(new Ex1RunnerA());
		Thread tb = new Thread(new Ex1RunnerB());
		Thread tc = new Thread(new Ex1RunnerC());
		
		ta.start();
		tb.start();
		tc.start();
	}
	
}
