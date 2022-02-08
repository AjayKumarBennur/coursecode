package com.te.object;

public class Test implements Cloneable{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Test t = (Test) obj;
		if (name == (t.name)) {
			return true;
		}
		return false;
	}

//	@Override
//	public String toString() {
//		return "Good morning"; 
//	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Test test = new Test();
		test.name = "Ajay";
		System.out.println(test.getClass().getName() + "@" + test.hashCode());
		System.out.println(test);
		Test test2 = new Test();
		test2.name = "kumar";
		System.out.println(test.equals(test2));
		System.out.println(test2);
		
		Test clone = (Test)test.clone();
		System.out.println(clone);
		
	}
}
