
public class defaultConstructor {

	String name; int a; boolean c;
	
	defaultConstructor(){
		name = "Sumit";
		a=20;
		c=true;
	}
	
	void show(){
		System.out.println(a+""+name);
	}
}
  
class B{
	
	public static void main(String[] args) {

		defaultConstructor HC = new defaultConstructor();
		HC.show();
	
	}

}
