package main.java.com.DimaSahachko.designPatterns.solutions.singleton;
/* Let's assume that we have a building (an office) with only one door. And each person who wants to
 * enter or exit this office have to walk through this door. We just don't have another way.
 * And every time you walk through this door you use your pass to open it.
 * Technically every time you are passing by this door you need an instance of the door to open/close it;
 * So we simply can count the number of people into this office*/
public class Singleton {

	public static void main(String[] args) {
		Worker billy = new Worker();
		Worker tim = new Worker();
		Worker bob = new Worker();
		Worker james = new Worker();
		Worker tom = new Worker();
		billy.goInside();
		tim.goInside();
		bob.goInside();
		james.goInside();
		tom.goInside();
		
		bob.goOutside();
		billy.goOutside();
		tim.goOutside();
		
		System.out.println(Door.getDoor().getPeopleInside());
	}

}
