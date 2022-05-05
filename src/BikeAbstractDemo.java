
public class BikeAbstractDemo {

	public static void main(String[] args) {
		
		BikeClass_Abstract Obj = new HondaBike();
		Obj.start();
		Obj.run();
		Obj.stop();
		BikeClass_Abstract.mileage();
		
		/*Obj = new YamahaBike();
		Obj.start();
		Obj.run();
		Obj.stop();
		BikeClass_Abstract.mileage();
		
		Obj = new KawasakiBike();
		Obj.start();
		Obj.run();
		Obj.stop();
		BikeClass_Abstract.mileage();*/
	}

}
