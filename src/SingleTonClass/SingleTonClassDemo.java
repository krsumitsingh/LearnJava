package SingleTonClass;

public class SingleTonClassDemo {

	private static SingleTonClassDemo ST =null;
	public String str;
	
	private SingleTonClassDemo(){
		
		str="Hey, this is my signleton design pattern test";
	}
	
	
	public static SingleTonClassDemo getInstance(){
		if(ST == null){
			
			ST = new SingleTonClassDemo();
		}
		
		return ST;
		
	}
	
	
	public static void main(String[] args) {

		SingleTonClassDemo x = SingleTonClassDemo.getInstance();
		SingleTonClassDemo y = SingleTonClassDemo.getInstance();
		SingleTonClassDemo z = SingleTonClassDemo.getInstance();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		y.str=(y.str).toLowerCase();
		
		
		
	}

}
