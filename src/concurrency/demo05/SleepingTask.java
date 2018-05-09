package concurrency.demo05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import concurrency.LiftOff;

/**
 * Th4 休眠例子
 * 
 * @author long
 *
 */
public class SleepingTask extends LiftOff {

	@Override
	public void run() {

		try {
			while (countDown-- > 0) {
				System.out.println(status());
				// old-style:
				Thread.sleep(100);
				//java SE5/6 style
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++)
			exec.execute(new SleepingTask());
		exec.shutdown();
	}
}
