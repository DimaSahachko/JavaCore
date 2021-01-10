package main.java.com.DimaSahachko.designPatterns.solutions.abstractFactory;
/*In this example we have a program that creates kits of New Year presents. And depending who is gonna present a kit
 * our program will add different things into the content */
public class AbstractFactory {

	public static void main(String[] args) {
		PresentKitFactory grannyKit = new GrannyPresentKitFactory();
		Eatable snack = grannyKit.getEatable();
		Readable smthToRead = grannyKit.getReadable();
		Playable thingToPlayWith = grannyKit.getPlayable();
		snack.eat();
		smthToRead.read();
		thingToPlayWith.play();
	}

}












