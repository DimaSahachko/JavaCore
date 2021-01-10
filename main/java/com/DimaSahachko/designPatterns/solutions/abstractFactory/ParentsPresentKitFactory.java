package main.java.com.DimaSahachko.designPatterns.solutions.abstractFactory;
/*Task description is in the AbstractFactory class*/
public class ParentsPresentKitFactory implements PresentKitFactory{
	@Override
	public Eatable getEatable() {
		return new Snikers();
	}
	@Override
	public Readable getReadable() {
		return new Tablet();
	}
	@Override
	public Playable getPlayable() {
		return new Computer();
	}
}