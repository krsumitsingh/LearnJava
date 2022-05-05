package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayList {

	public static void main(String[] args) {

		boolean bool;
		ArrayList<Object> arr1 = new ArrayList<>(Arrays.asList(2,"sumit","jodie","sunny"));
		/*arr1.add("john");
		arr1.add("sumit");
		arr1.add("jodie");
		arr1.add("sunny");*/
		System.out.println("Items in the arr1 are "+arr1);

		ArrayList<String> arr2= new ArrayList<>(Arrays.asList("john","sumit","jodie","sunny"));
		/*arr2.add("john");
		arr2.add("sumit");
		arr2.add("jodie");
		arr2.add("sunny");*/
		System.out.println("Items in the arr2 are "+arr2);

		/*bool = arr1.equals(arr2);
		System.out.println(bool);*/

		if(arr1.equals(arr2)==true){
			System.out.println("Both the array list are equal");
		}else{
			System.out.println("Both the array list are not equal");
		}

	}

}
