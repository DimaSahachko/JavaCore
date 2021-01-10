package main.java.com.DimaSahachko.designPatterns.solutions.abstractFactory;
/*Task description is in the AbstractFactory class*/
public class GrannyPresentKitFactory implements PresentKitFactory {
	@Override
	public Eatable getEatable() {
		return new Cookie();
	}
	@Override
	public Readable getReadable() {
		return new Book();
	}
	@Override
	public Playable getPlayable() {
		return new TeddyBear();
	}
}

