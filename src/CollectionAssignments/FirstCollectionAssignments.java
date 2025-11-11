package CollectionAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstCollectionAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined
		
		List<String> largestCities = new ArrayList<String>();
		largestCities.add("Delhi-1484");
		largestCities.add("Bengluru-741");
		largestCities.add("Vishakhapatnam-681.96");
		largestCities.add("Hyderabad-650");
		largestCities.add("Lucknow-631");
		
		System.out.println("Total Area of the 3rd Hyderabad and 4th Lucknow area in sq.km.:" +650+"," +631);
		
		
		// 2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		Set<String> tourPlace = new HashSet<String>();
		tourPlace.add("Eiffel Tower");
		tourPlace.add("Colosseum");
		tourPlace.add("Taj Mahal");
		tourPlace.add("Louvre Museum");
		tourPlace.add("Times Square");
		tourPlace.add("Great Wall of China");
		tourPlace.add("Sagrada Familia");
		tourPlace.add("Metropolitan Museum of Art");
		tourPlace.add("Vatican Museums");
		tourPlace.add("Gardens by the Bay");
		int size=tourPlace.size();
		
		System.out.println("Eiffel Tower");
		System.out.println("Colosseum");
		System.out.println("Taj Mahal");
		System.out.println("Louvre Museum");
		System.out.println("Times Square");
		System.out.println("Great Wall of China");
		System.out.println("Sagrada Familia");
		System.out.println("Metropolitan Museum of Art");
		System.out.println("Vatican Museums");
		System.out.println("Gardens by the Bay");
		
		System.out.println("The size is : "+ size);
		
		
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		ArrayList<Integer> avgNumbers = new ArrayList<Integer>();
		avgNumbers.add(10);
		avgNumbers.add(25);
		avgNumbers.add(55);
		avgNumbers.add(100);
		avgNumbers.add(25);
		avgNumbers.add(75);
		avgNumbers.add(35);
		avgNumbers.add(45);
		avgNumbers.add(15);
		avgNumbers.add(95);
		
		//System.out.println("5th element :"+ avgNumbers.get(4));
		int sum = avgNumbers.get(4) + avgNumbers.get(5);
		double average= sum/2;
		
		System.out.println("The average of 5th and 6th value is :" + average);
		
		
		
		// 4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> movieNames = new ArrayList<String>();
		movieNames.add("AVATAR");
		movieNames.add("Avengers: Endgame");
		movieNames.add("Avatar: The Way of Water");
		movieNames.add("Titanic");
		movieNames.add("Star Wars: Episode VII - The Force Awakens");
		
		System.out.println("The 3rd movie from top movie list : "+ movieNames.get(2));
		
		
		
		
		
	}

}
