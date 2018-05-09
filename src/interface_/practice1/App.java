package interface_.practice1;

/**
 * 测试类
 * @author long
 *
 */
public class App {

	private static void costom() {

		Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};
		
		for (Rodent rodent : rodents) {
			rodent.shout();
			System.out.println(rodent.getName());
		}
	}
	
	public static void main(String[] args) {
		costom();
	}
}
