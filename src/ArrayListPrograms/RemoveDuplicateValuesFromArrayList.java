package ArrayListPrograms;
import java.util.ArrayList;

public class RemoveDuplicateValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Sam");
		arr.add("Sherry");
		arr.add("Sam");
		arr.add("Robin");
		arr.add("Dakota");
		arr.add("Sherry");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		arr.add("Chynthia");
		
		
		for(String name1:arr){
			System.out.println("Duplicate names before removal.."+name1);
		}
		
		for(int i=0;i<=arr.size();i++){
			
			for(int j=i+1;j<=arr.size()-1;j++){
				
				if(arr.get(i).equalsIgnoreCase(arr.get(j))){
					arr.remove(j);
					j--;
				}
				
			}
			
		}
		
		 for(String names:arr){
			 System.out.println("Names after duplicate removals.."+names);
		 }
		
		
	}

}
