package enumerated;

/**
 * 枚举类型
 * @author long
 *
 */
enum Shrubbery{
	GROUND,  CRAWLING, HANGING,JUN
	}

/**
 * 测试枚举类型        枚举类型的定义，获取枚举类型的实例
 * @author long
 *
 */
public class EnumClass {

	public static void main(String[] args) {
		
		for(Shrubbery s :Shrubbery.values()) {
			System.out.println(s+"ordinal:"+s.ordinal());
			System.out.print(s.compareTo(Shrubbery.CRAWLING)+" ");
			System.out.print(s.equals(Shrubbery.CRAWLING)+" ");
			System.out.print((s==Shrubbery.CRAWLING)+"\n");
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("=======================");
		}
		
		for(String s : "GROUND CRAWLING HANGING".split(" ")) {
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
			System.out.println(shrub);
		}
	}
}
