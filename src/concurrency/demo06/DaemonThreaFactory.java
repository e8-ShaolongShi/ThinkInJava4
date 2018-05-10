package concurrency.demo06;

import java.util.concurrent.ThreadFactory;

/**
 * th4 demo : 创建一个线程工厂，  创建线程的工厂，传入任务，产出的是附着在任务上的线程
 * @author long
 *
 */
public class DaemonThreaFactory implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		return t;
	}

}
