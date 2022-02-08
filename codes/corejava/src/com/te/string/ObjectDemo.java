package com.te.string;

/*class Object{
	public int hashCode() {
		return unique nubmer for each object
	}
	public boolean equals(Object obj) {
		return currentObjecthashCode()==obj.hashCode();
	}
	public String toString() {
		return packageName + classname + hexadecimal + hashCode();
	}
	protected void finalize() throws Throwable{
		Garbage Collector collect de-refer object
	}
}*/
class St {
	int id;
	String name;

	public St(int id, String name) {
		this.id = id;
		this.name = name;
	}

	protected void finalize() throws Throwable {
		System.out.println("object de-refered and GC collecting object");
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		St s1 = new St(101, "Ram");
		St s2 = new St(101, "Ram");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		s1 = null;
//		s2 = null;
		System.gc();
	}
}
