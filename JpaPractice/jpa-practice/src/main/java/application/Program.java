package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import domain.Animal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal(null, "Horse", "White");
		Animal a2 = new Animal(null, "Monkey", "Brown");
		Animal a3 = new Animal(null, "Dog", "Black");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicing-jpa");
		EntityManager em = emf.createEntityManager();
		
		//This is what you need to do if you wanto to add an animal
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.getTransaction().commit();
		
		
		
		/*If you want to search for an animal in the database do this:
		 
		 * Animal a = em.find(Animal.class,2);
		 */
		
		/*First way to delete an animal:
		 * 
		 * Animal a = em.find(Animal.class, 2);
		 * em.remove(a);
		 * */
		
		/*Second way to delete an animal:
		 * 
		 * Animal a = em.find(Animal.class,2);
		 *  em.getTransaction().begin();
		 *  em.remove(a);
		 *  em.getTransation.commit();
		 * 
		 * */
		
		
		
		System.out.println("Done! :)");
		em.close();
		emf.close();
		
		
	}

}
