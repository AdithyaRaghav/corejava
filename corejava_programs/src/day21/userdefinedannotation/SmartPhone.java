package day21.userdefinedannotation;

public class SmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.lang.annotation.Retention;
		import java.lang.annotation.Target;
		import java.lang.annotation.ElementType;
		import java.lang.annotation.RetentionPolicy;

		@Target(ElementType.TYPE)
		@Retention(RetentionPolicy.RUNTIME)
		public @interface SmartPhone {
			String os() default "Android";

			int version() default 1;
		}
	}

}
