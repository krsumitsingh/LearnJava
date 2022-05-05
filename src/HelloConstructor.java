
public class HelloConstructor {

	String name;
	HelloConstructor(){
		//System.out.println("My name is "+name);
		name="Sumit Kumar Singh";
	}
	
	
	public static void main(String[] args) {

		HelloConstructor HC = new HelloConstructor();
		System.out.println(HC.name);
	
	
	
	}

}
