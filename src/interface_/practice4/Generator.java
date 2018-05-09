package interface_.practice4;

/**
 * 老鼠类
 * 
 * @author long
 *
 */
public class Generator extends Base{

	private int i = 52;
	public Generator() {
		print();
	}

	protected void print() {
		System.out.println(this.getClass().getSimpleName()+"---"+i);
	}
}
