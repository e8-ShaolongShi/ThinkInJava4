package concurrency.demo06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * demo：练习为线程设置优先级
 * @author long
 *
 */
public class SimplePriorities implements Runnable {

	private int countDown = 5;
	private volatile double d;   //no optimization
	private int priority;
	
	public SimplePriorities(int priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return Thread.currentThread()+":"+countDown;
	}
	
	/*
	 * (non-Javadoc)   封装的是线程任务   任务是对d做 5 *  10万次的浮点运算，
	 *                 测一下优先级高的和优先级低的哪个调用的次数多    
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);   //优先级的等级是定义的一些int类型的值所确定的
		while(true) {    //写的是死循环
			//An expensive, interruptable operation;
			for(int i=5; i<100000; i++) {
				d += (Math.PI + Math.E) / (double)i;
				if(i % 1000 == 0)    //每执行1000次，让一下线程的执行权
					Thread.yield();
			}
			System.out.println(this);
			if(--countDown == 0) return;  //死循环的终止条件
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		//添加5个优先级高的任务
		for(int i=0; i<5; i++) {   
			exec.execute(
					new SimplePriorities(Thread.MIN_PRIORITY));
		}
		//添加一个优先级低的任务
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		//提交所有的任务
		exec.shutdown();
	}
}
