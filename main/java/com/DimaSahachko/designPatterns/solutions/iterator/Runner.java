/*We have an JobSeeker interface which define an iterable thing  - the aggregate thing we will iterate over. This interface has only one
 * method getIterator which returns you object of type JobSeekerIterator - another interface that define methods that our concrete iterators 
 * will implement. Since we are writing a specific iterator for our class we know that the thing that an iterator will return is an Award type.
 * Then we create a concrete class JobSeekerDeveloper which implements an interface JobSeeker and has a list of his awards.
 * Then in our implementation of getIterator() method we return an concrete realization of JobSeekerIterator interface 
 * (JobSeekerDeveloperIterator) that will be able to iterate over our class and pass an list of our awards to the constructor of this
 * concrete iterator.
 * JobSeekerDeveloperIterator stores our rewards as an instant variable. We provide realization of its methods.
 * And class Runner simply pull everything together and run an fulfilling of application.  
 * */
package main.java.com.DimaSahachko.designPatterns.solutions.iterator;
import java.util.*;
public class Runner {

	public static void main(String[] args) {
		Award bestEmployee = new Award("Best employee of PDB company", 2018);
		Award hardWorker = new Award("HARD WORKER", 2015);
		Award forIngenuity = new Award("INGENIOUS", 2020);
		List<Award> awards = new ArrayList<>();
		awards.add(bestEmployee);
		awards.add(hardWorker);
		awards.add(forIngenuity);
		
		JobSeekerDeveloper bob = new JobSeekerDeveloper("Bob", 34, awards);
		JobSeekerIterator iterator = bob.getIterator();
		System.out.println(bob.name + " awards are: ");
		
		while(iterator.isDone()) {
			System.out.println(iterator.current().toString() + " ");
			iterator.next();
		}
		
	}

}
