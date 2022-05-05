package ArraysPrograms;

public class ArrayLargestValue {

	public static void main(String[] args) {

		int[] arr = {41,10,20,50,80};

		int MAX_Value = 0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>MAX_Value){

				MAX_Value=arr[i];

			}
		}
		System.out.println(MAX_Value);			

	}

}
