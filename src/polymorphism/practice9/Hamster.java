package polymorphism.practice9;

/**
 * 大颊鼠类
 * @author long
 *
 */
public class Hamster extends Rodent{

	@Override
	protected String getName() {
		return super.getName()+"Hamster!!!";
	}
	
	@Override
	protected void shout() {
		System.out.println("Hamster`s shout!!!");
	}
}
