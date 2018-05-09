package concurrency.demo03;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {

	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TaskWithResult" + id;
	}

}

public class CallableDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			//未将结果抛出
//			Future<String> future = executorService.submit(new TaskWithResult(i));
			//将结果以结果集的形式抛出
			results.add(executorService.submit(new TaskWithResult(i)));
		}
		
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				System.out.println(e);
			} catch (ExecutionException e) {
				System.out.println(e);
			}finally {
				executorService.shutdown();
			}
		}
	}
}
