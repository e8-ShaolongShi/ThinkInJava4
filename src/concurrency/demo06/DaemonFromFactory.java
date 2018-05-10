package concurrency.demo06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * th4 demo: 从线程工厂中得到的守护线程 
 * @author long
 *
 */
public class DaemonFromFactory implements Runnable {

	/**
	 * 封装的是任务
	 */
	@Override
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		//用线程工厂构造执行器， ，，意思就是告诉执行器，以后你创建线程时使用工厂进行创建
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreaFactory());
		for(int i=0; i<10; i++)
			exec.execute(new DaemonFromFactory());
		exec.shutdown();
		System.out.println("all daemons started!!!");
		TimeUnit.MILLISECONDS.sleep(500);    //等待一会
	}
}
