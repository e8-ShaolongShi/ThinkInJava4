package polymorphism.practice9;

/**
 * 练习一  ：修改第八章中的练习九
 * 
 * 创建一个啮齿动物的基类
 * @author long
 *
 */
public class Rodent {
	
	protected String getName() {
		return "Rodent:";
	}
	
	/**
	 * 叫
	 */
	protected void shout() {
		System.out.println("Rodent`shout");
	}	
	
}
