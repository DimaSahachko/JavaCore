package main.java.com.DimaSahachko.designPatterns.examples.facotryMethod;

public class Program {

	public static void main(String[] args) {
		DeveloperFactory factory = createDeveloperFactory("PhP");
		Developer dev = factory.createDeveloper();
		dev.writeCode();
	}
	static DeveloperFactory createDeveloperFactory(String type) {
		if(type.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		} else if (type.equalsIgnoreCase("cpp")) {
			return new CppDeveloperFactory();
		} else if(type.equalsIgnoreCase("php")) {
			return new PhpDeveloperFactory();
		} else {
			throw new RuntimeException(type + " illegal type parametr");
		}
	}

}
interface Developer {
	void writeCode();
}
class JavaDeveloper implements Developer {
	public void writeCode() {
		System.out.println("Java developer writes java code...");
	}
}
class CppDeveloper implements Developer {
	public void writeCode() {
		System.out.println("Cpp developer writes cpp code...");
	}
}
class PhpDeveloper implements Developer {
	public void writeCode() {
		System.out.println("Php Developer writes php code...");
	}
}


interface DeveloperFactory {
	Developer createDeveloper();
}
class JavaDeveloperFactory implements DeveloperFactory {
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}
}
class CppDeveloperFactory implements DeveloperFactory{
	public Developer createDeveloper() {
		return new CppDeveloper();
	}
}
class PhpDeveloperFactory implements DeveloperFactory {
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}
}