import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String algorithm = "";
		System.out.print("What algorithm would you like to execute? ");
		algorithm = in.nextLine();
		algorithm.toLowerCase();
		
		String data = "";
		System.out.print("What type of data? ");
		data = in.nextLine();
		data.toLowerCase();
		
		String stored = "";
		System.out.print("How is it stored? ");
		stored = in.nextLine();
		stored.toLowerCase();
		
		String listdata = "";
		System.out.print("Enter the data: ");
		listdata = in.nextLine();
		String[] userdata = listdata.split(",");
		
		String[] bubblesort = Bubble(userdata);
		System.out.println(Arrays.toString(bubblesort));
	}
	
	private static String[] Bubble(String[] userdata) {
		for(int j = 0; j < userdata.length - 1; j++) {
			for(int i = 0; i < userdata.length - 1; i++) {
				if(userdata[i].compareTo(userdata[i+1]) > 0) {
					String temp = userdata[i];
					userdata[i] = userdata[i+1];
					userdata[i+1] = temp;
				}
			}
		}
		return userdata;
	}
}