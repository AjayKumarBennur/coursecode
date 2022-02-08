package constructor;

public class ConstructorExample {

	String name;
	int id;

	ConstructorExample() {
		System.out.println("this is from no args constructor");
	}

	ConstructorExample(String employeeName,int id) {
		name = employeeName;
		this.id = id;
	}

	public static void main(String[] args) {
		ConstructorExample constructor = new ConstructorExample();
		constructor.id=10;
		constructor.name="Kumar";
		
		ConstructorExample constructorWithArgs = new ConstructorExample("Ajay",10);
		
		System.out.println(constructor.name+"::"+constructor.id);
		
		System.out.println(constructorWithArgs.name+"::"+constructorWithArgs.id);
		
	}
}
