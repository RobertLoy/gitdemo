package git_gitdemo;

public class Start {

	public static void main(String ...strings) {
		funcPhilip();
		funcSteve();
		funcMara();
		funcRob();
		funcJames();
		
		Philip p = new Philip();
		p.sayGoodBye();
		System.out.println(p.sayGoodBye());
		
	}
	// Changes made to funcPhilip with syso
	// Changes made on 06/16/2020 by Philip Evans
	private static void funcPhilip() {
		System.out.println("The secret of getting ahead is getting started.");
		System.out.println("-Mark Twain");
	}
	
	private static void funcSteve() {
		// Create a syso with a motivational message
		System.out.println("You can do it!");
		
		Steve steve = new Steve();
		String s = steve.sayGoodBye();
		System.out.println(s);
		
		
	}
	
	private static void funcMara() {
		System.out.println("I have a great class!");
	}
	
	private static void funcRob() {
		// Create a syso with a motivational message
	}
	
	private static void funcJames() {
		// Create a syso with a motivational message
	}
	
}
