package interface_.practice1;

/**
 * 老鼠类
 * @author long
 *
 */
public class Mouse extends Rodent{

	@Override
	protected String getName() {
		return super.getName()+"Mouse!!!";
	}
	
	@Override
	protected void shout() {
		System.out.println("Mouse`s shout!!!");
	}
}
