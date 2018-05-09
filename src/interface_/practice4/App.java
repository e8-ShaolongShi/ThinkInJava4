package interface_.practice4;

/**
 * 测试类
 * @author long
 *
 */

abstract class Dad{
	protected abstract void print();
}

class Son extends Dad{

	@Override
	protected void print() {
		System.out.println(this.getClass().getSimpleName());
	}
}

public class App {

	public static void costom(Base base) {
		((Generator)base).print();
	}
	
	public static void custom(Dad dad) {
		dad.print();
	}
	
	public static void main(String[] args) {
		
		/* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero  
		* 2. Dad() called
		* 3. Son.print() called in Dad() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
		costom(new Generator());
		custom(new Son());
	}
}

