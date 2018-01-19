/*@author: Derfel Terciano
 * 
 * Version:1
 * 
 * Task for ArrayList
 * 
 */
package ArrayLists;

import java.util.*;

public class ArrayOfListTask {

	
	/*Classwork for 1/18/18
	ArrayList Programming Task:
	Write a segment of code that takes an ArrayList of Strings named list and determines:
	The length of the longest String in the list
	The length of the shortest String in the list
	The average length of Strings in the list.
	Notes: Compute the average as a double value. You can assume that the
	ArrayList has already been declared and is named list.
	*/
	
	public static void main(String[] args) {
		String[] setupList = {"Hello", "World", "How", "are", "you","OOOBAGooddjhhf","today"};
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(setupList));
		
		System.out.println(lengthOfLongest(list));
		System.out.println(lengthOfShortest(list));
		System.out.println(averageOfList(list));
	}
	
	
	public static int lengthOfLongest(ArrayList<String> inputList) {
		int counter = 0;
		for(Integer i = 0;i < inputList.size();i++) {
			if(inputList.get(i).length()>counter) {
				counter=i;
			}
		}
		return inputList.get(counter).length();
	}
	
	public static int lengthOfShortest(ArrayList<String> inputList) {
		int shortest= inputList.get(0).length();
		for(Integer i = 0; i<inputList.size();i++) {
			if(inputList.get(i).length() < shortest) {
				shortest=inputList.get(i).length();
			}
		}
		return shortest;
	}
	
	public static double averageOfList(ArrayList<String> inputList) {
		double sum=0;
		for(Integer i = 0; i<inputList.size();i++) {
			sum += inputList.get(i).length();
		}
		return round2(sum/inputList.size());
	}
	
	public static double round2(double num) {
		double x = (num - num % 0.001) * 1000;
		if (x % 10 >= 5) {
			x += 10;
			return (x - x % 10) / 1000;
		} else {
			return (x - x % 10) / 1000;
		}
	}
	
}
