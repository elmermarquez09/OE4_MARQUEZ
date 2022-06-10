//Marquez Elmer Jr C
//BSIT2-1
package bikeproject;
import java.util.*;
public class countries {

	public static void main(String[] args) {
		
		HashSet<String>country = new HashSet<String>();
		
		country.add("China");
		country.add("Nigeria");
		country.add("Japan");
		country.add("Russia");
		country.add("Italy");
		country.add("China");
		
		Iterator<String> it = country.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

	}

}