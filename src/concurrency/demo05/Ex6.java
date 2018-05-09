package concurrency.demo05;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 练习6：写一个任务，它随机睡眠1-10分钟；然后显示睡了多长时间
 * @author long
 *
 */
public class Ex6 implements Runnable{

	private int sleep;
	
	public Ex6() {
		this.sleep = new Random().nextInt(9)+1;
	}
	
	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(sleep);
			System.out.println(Thread.currentThread()+"-----sleeptime:"+sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for(int i=0; i<5; i++) {
			executorService.execute(new Ex6());
		}
		
		//添加完毕，启动执行
		executorService.shutdown();
		System.out.println(Thread.currentThread());
	}
}
