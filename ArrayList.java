package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args){
		listGenericTotal(addElementGenericArray());
	}
	
	public static List<Integer> addElementGenericArray(){
		//Creating a list of type Integer using ArrayList
		
		//List<datatype> listName = new ArrayList<datatype>
		List<Integer> list = new ArrayList <Integer>();	//ArrayListObject
		
		//add elements using keyboard inputs
		Scanner sc = new Scanner(System.in);
		
		//check if array is empty
		if(list.isEmpty() == true)
			System.out.println("List is Empty!");
		
		System.out.println("Please enter values for the list: ");
		
		//get 10 numbers, iterate 10 times
		for(int i = 0; i < 10; i++){
			System.out.println("Enter value " + (i+1) + ":");
			
			
			//once user enter values, need to add to list
			list.add(sc.nextInt());
		}
		
		return list;
	}
	//Getting the total
	//traversing through the list - getting the 
	public static void listGenericTotal(List<Integer> list){
		int total = 0;
		int i = 0;
		
		//for(datatype type_variable : collectionName)
		for(Integer x : list){
			
			total += x;
			//print 10 numbers
			System.out.println("Value " + (i+1) + ": " + x);
			i++;
		}
		//print total
		System.out.println("Total = " + total); 
	}
}
