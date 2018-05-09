package concurrency.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import concurrency.LiftOff;

/**
 * 练习使用执行器Executor：
 * jdk提供介于客户端和任务之间，相当于中介，它替我们调用任务
 * 这样，我们就不用显示的使用Thread对象调用任务了
 * @author long
 *
 */
public class FixedThreadPool {
	
	public static void main(String[] args) {

		ExecutorService exec = Executors.newFixedThreadPool(5);   //指定线程个数
		for(int i=0; i<5; i++) 
			exec.execute(new LiftOff());
		exec.shutdown();   //截止，将所有的任务都提交完毕，执行吧
	}
}
