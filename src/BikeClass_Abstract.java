
public abstract class BikeClass_Abstract {
	
	public BikeClass_Abstract() {
		System.out.println("Bike abstract class is created");
	}
	
	abstract void run();
	
	final void start(){
		System.out.println("Bike has started");
	}
	
	void stop(){
		System.out.println("Bike has stopped");
	}
	
	static void mileage(){
		System.out.println("Bike has an excellent mileage");
	}
}
