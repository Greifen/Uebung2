package Annotation;

@Author(name="Marius", array={1,2,3}, d=5)
public class Person {
	

	private int age;
	

	private String name;
	

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Author(name="Karin", array={1,7,3}, d=5)
	public int getAge() {
		return age;
	}
	
	@Author
	public void setAge(int age) {
		this.age = age;
	}
	
	@Author
	public String getName() {
		return name;
	}
	
	@Author(name="Marius")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
