package main.java.com.DimaSahachko.designPatterns.solutions.prototype;
/* Let's assume that we are creating a strategy game. We have two classes that reflect two type of soldiers.
 * All soldiers of one class have equal parameters. So we can create one object of each class and then just copy them.
 * We also create a class that will help us in producing copied objects */
public class Army {

	public static void main(String[] args) {
		SoldierFactory barack = new SoldierFactory();
		Swordman sOne = barack.copySwordman();
		Swordman sTwo = barack.copySwordman();
		Swordman sThree = barack.copySwordman();
		System.out.println(sOne);
		System.out.println(sTwo);
		System.out.println(sThree);
		
		Pikeman pOne = barack.copyPikeman();
		Pikeman pTwo = barack.copyPikeman();
		Pikeman pThree = barack.copyPikeman();
		System.out.println(pOne);
		System.out.println(pTwo);
		System.out.println(pThree);
	}

}
