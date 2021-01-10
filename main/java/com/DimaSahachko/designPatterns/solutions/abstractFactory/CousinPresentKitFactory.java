package main.java.com.DimaSahachko.designPatterns.solutions.abstractFactory;
/*Task description is in the AbstractFactory class*/
public class CousinPresentKitFactory implements PresentKitFactory {
	@Override
	public Eatable getEatable() {
		return new Gum();
	}
	@Override
	public Readable getReadable() {
		return new Ebook();
	}
	@Override
	public Playable getPlayable() {
		return new Ball();
	}
}