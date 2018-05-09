package polymorphism.practice9;

/**
 * 鼠类
 * @author long
 *
 */
public class Gerbil extends Rodent{

	@Override
	protected String getName() {
		return super.getName()+"Gerbil!!!";
	}
	
	@Override
	protected void shout() {
		System.out.println("Gerbil`s shout!!!");
	}
}
