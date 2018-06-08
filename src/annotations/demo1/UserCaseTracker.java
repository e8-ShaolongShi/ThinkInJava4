package annotations.demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 为UseCase注解类创建的处理器
 * @author long
 */
public class UserCaseTracker {

	public static void trackUseCase(List<Integer> useCases,Class<?>cl ) {
		for(Method m:cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null) {
				System.out.println("有这个id："+uc.id()+" ,描述为："+uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		
		for (Integer i : useCases) {
			System.out.println("warnning: missing this id:"+i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> UseCases = new ArrayList<>();
		Collections.addAll(UseCases, 47,48,49,50);
		trackUseCase(UseCases,PasswordUtils.class);
	}
}
