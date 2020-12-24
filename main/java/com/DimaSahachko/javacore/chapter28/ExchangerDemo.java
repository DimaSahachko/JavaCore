package main.java.com.DimaSahachko.javacore.chapter28;
import java.util.concurrent.*;
public class ExchangerDemo {
	
	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<>();
		new Thread(new MakeString(exgr)).start();
		new Thread(new UseString(exgr)).start();
	}

}
class MakeString implements Runnable {
	Exchanger<String> ex;
	String s = new String();
	MakeString(Exchanger<String> ex) {
		this.ex = ex;
	}
	public void run() {
		char ch = 'A';
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				s+= ch++;
			}
			try{
				s = ex.exchange(s);			
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class UseString implements Runnable {
	Exchanger<String> ex;
	String str;
	UseString(Exchanger<String> exg) {
		ex = exg;
	}
	public void run() {
		for(int x = 0; x < 3; x++ ) {
			try {
				str = ex.exchange(new String());
				System.out.println("Got " + str);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
