package interface_.practice3;

/**
 * 测试类
 * @author long
 *
 */
public class App {

	public static void main(String[] args) {
		
		/* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero  
		* 2. Dad() called
		* 3. Son.print() called in Dad() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
		
		Base base = new Generator();
		base.print();
	}
}

/*  结果：
0     //基类构造器打印的
52	  //子类调用的打印方法打印的


 */
