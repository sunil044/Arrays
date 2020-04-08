package arrays;

public class Array_2d {

	public static void main(String[] args) {
		
		String [][] arr = 
			{
					{"A", "B", "c"},
					{"e", "g", "f"},
					{"AS", "BH", "FG", "DF"}
			};
				
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][1]);
		
		arr[2][1] = "aaaa";
		System.out.println(arr[2][1]);
		
		for(String[] x : arr) {
			for(String y : x ) {
				System.out.println(y);
			}
			System.out.println("------------------------------------------");
		}
	}
	
	
}


