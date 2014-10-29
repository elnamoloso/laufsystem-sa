package mypackage;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	private static final String PERSISTENCE_UNIT_NAME = "my-jpa";
	private static EntityManagerFactory emf = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to FirstJPA");
		System.out.println("Creating Books...");

		Book firstBook = new Book();
		Book secondBook = new Book();

		firstBook.setIsbn(3446427287L);
		firstBook.setAuthor("Max Muster");
		firstBook.setTitle("Effektive Software Architekturen");

		secondBook.setIsbn(321815734L);
		secondBook.setAuthor("Hans Wurst");
		secondBook.setTitle("Practice Software Architecture");

		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		System.out.println("Persisting objects in database...");
		em.getTransaction().begin();
		em.persist(firstBook);
		em.getTransaction().commit();
		em.getTransaction().begin();
		em.persist(secondBook);
		em.getTransaction().commit();
		em.close();

		System.out.println(" Goodbye ");

		System.out.println("Das wars");

	}

}
