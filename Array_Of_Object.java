package arrays;

public class Array_Of_Object {

	public static void main(String[] args) {
		Object [] arr = {"Sunil", 22, 4.25, 'M'};
		
		for(Object x : arr) {
			
			System.out.println(x);
		}
		
		
        Object [][] arr1 = {
        		{"Sunil", 22, 4.25, 'M'},
        		{"Shivani", 78, 8.90, 'S'},
        		{"Aishwarya", 48, 9.10, 'P'},
        		{"Gourav", 97, 4.20, 'O'}
        };
		
		for(Object [] x : arr1) {
			for(Object y : x) {
				System.out.print(y + " " );
			}
			System.out.print("\n");
		}
	}

}
