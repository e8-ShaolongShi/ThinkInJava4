package concurrency.demo06;

import java.util.concurrent.TimeUnit;

/**
 * java编程思想，简单的后台线程（守护线程）列子
 * @author long
 */
public class SimpleDaemons implements Runnable{

	@Override
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			System.out.println("sleep() interrupted!!!");
		}
	}
	
	/**
	 * 主程序运行后   启动10个线程驱动任务执行
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);  //设置为后台线程
			daemon.start();
		}
		
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(175);
	}
}
