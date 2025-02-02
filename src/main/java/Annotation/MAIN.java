package Annotation;

import java.lang.reflect.Method;

public class MAIN {

	public static void main(String[] args) {
		
		Method[] methods = Person.class.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Author.class)) {
				Author author = method.getAnnotation(Author.class);
				System.out.println("Method: " + method.getName() + " was written by: " + author.name());
				for (int i : author.array()) {
					System.out.println(i);
				}
				System.out.println(author.d());
			}
		}
	}
}
