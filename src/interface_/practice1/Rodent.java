package interface_.practice1;

/**
 * 练习一  ：修改第八章中的练习九
 * 
 * 创建一个啮齿动物的基类
 * @author long
 *
 */
public abstract class Rodent {
	
	protected String getName() {
		return "Rodent:";
	}
	
	/**
	 * 叫
	 */
	protected abstract void shout();	
	
}
