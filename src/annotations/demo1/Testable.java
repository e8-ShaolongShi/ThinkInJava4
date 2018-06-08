package annotations.demo1;

import atunit.Test;

/**
 * 测试定义的注解
 * 
 * @author long
 *
 */
public class Testable {

	public void execute() {
		System.out.println("Executing ......");
	}

	@Test
	void testExecute() {
		execute();
	}

}
