package ArraysPrograms;

import java.util.Scanner;

public class SortElementsInASC {

	static int ARRAY_SIZE, TEMP;
	
	
	
	static Scanner scan;	
	public static void main(String[] args) {
		int Temp=0;
		
		scan = new Scanner(System.in);
		System.out.println("Enter the size of ARRAY");
		ARRAY_SIZE = scan.nextInt();
		int num[] = new int[ARRAY_SIZE];
		System.out.println("The size of the ARRAY is "+num.length);
		System.out.println("Enter the elements into ARRAY");
		for(int i=0;i<num.length;i++){
			
			num[i] = scan.nextInt();
			//System.out.println("Elements added in the ARRAY before sorting "+num[i]);
		}
		
		for(int i=0; i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					Temp=num[j];
					num[j]=num[i];
					num[i]=Temp;				
				}					
			}
			
			
			System.out.println(num[i]);
		}
		
		/*sortArray SA = new sortArray();
		System.out.println("Sorted array elements in ascending order "+SA.sortTheArrays(num));*/
	}
	
}


/*class sortArray{
	
	int Temp=0;
	public int[] sortTheArrays(int num[]){
		
		for(int i=0; i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]<num[j]){
					Temp=num[j];
					num[j]=num[i];
					num[i]=Temp;				
				}					
			}
			
			
			
		}
		
		
		return num;
		
	}
	
	
}*/