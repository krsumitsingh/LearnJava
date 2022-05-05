package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SortArrayListASC {
	static int num;
	static String Arrnames;
	static Scanner scan;
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println("Enter how many times you want to add an string element into Arraylist? ");
		scan = new Scanner(System.in);
		num = scan.nextInt();
		
		for(int i=0;i<=num;i++){
			Arrnames = scan.next();
			names.add(Arrnames);
		}
		
		//System.out.println(names);
		
	Iterator<String> nam=names.iterator();
		while(nam.hasNext()){
			String name1=nam.next();
			System.out.println("Before Sorting.."+name1);
		}
		
		
	 Collections.sort(names);
	 
	 for(String sortedNames: names){
		 System.out.println("Sorted Names.."+sortedNames);
	 }
	 
	}

}
