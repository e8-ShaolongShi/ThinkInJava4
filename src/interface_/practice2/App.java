package interface_.practice2;

/**
 * @author long
 *
 */
abstract class Rodent {
	
	protected String getName() {
		return "Rodent:";
	}
	
	/**
	 * 叫
	 */
	protected void shout(){
		System.out.println("test");
	}
	
}
/**
 * 测试类
 * @author long
 *
 */
public class App {

	public static void main(String[] args) {
//		new Rodent();   //Cannot instantiate the type Rodent
	}
}
