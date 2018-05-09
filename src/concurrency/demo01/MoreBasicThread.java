package concurrency.demo01;

import concurrency.LiftOff;

/**
 * 此类是书中的MoreBasicThread例子
 * @author long
 *
 */
public class MoreBasicThread {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("waiting for LiftOff!!!");
	}
}