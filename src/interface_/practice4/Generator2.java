package interface_.practice4;
import interface_.Practice6;
/**
 * 老鼠类
 * 
 * @author long
 *
 */
public class Generator2 extends Base implements Practice6{

	private int i = 52;
	public Generator2() {
		print();
	}

	protected void print() {
		System.out.println(this.getClass().getSimpleName()+"---"+i);
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
}
