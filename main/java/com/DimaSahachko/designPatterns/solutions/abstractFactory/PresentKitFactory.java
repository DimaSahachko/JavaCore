package main.java.com.DimaSahachko.designPatterns.solutions.abstractFactory;
/*Task description is in the AbstractFactory class*/
public interface PresentKitFactory{
	Eatable getEatable();
	Readable getReadable();
	Playable getPlayable();
}
