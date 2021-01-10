package main.java.com.DimaSahachko.designPatterns.solutions.templateMethod;
/*We have an abstract class LawyerFirm which has a method doWork() which provides an algorithm of action which will be taken when
 * a client turn to lawyer firm for help. There are parts of work which is invariant in different firms and we can specify it in the 
 * abstract class (super class). But there also are abstract methods which will be implemented in subclasses and method with empty
 * implementation (hooks) which can be either implemented or not implemented in the subclasses */
public class Client {

	public static void main(String[] args) {
		LawyerFirm highProfileFirm = new HighProfileLawyerFirm();
		LawyerFirm cheapFirm = new CheapLawyerFirm();
		highProfileFirm.doWork();
		System.out.println("\n=============\n");
		cheapFirm.doWork();
	}

}
