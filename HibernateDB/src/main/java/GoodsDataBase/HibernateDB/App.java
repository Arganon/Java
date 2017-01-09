package GoodsDataBase.HibernateDB;

//import entity.Printer;
import entity.Test;
import entity.Unit;
import entity.Product;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("initentitymanager");
		EntityManager entityManager = sessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Product product = new Product();
		Unit test = new Test("samsung", "y555x", "printer", "Test");
	
//		TestBuilder tb = new TestBuilder(test, "samsung", "y555x", "printer");
//		Director director = new Director();

//		director.build(tb);
		
		Set<Unit> tests = new HashSet<>();
		tests.add(test);
		product.setTests(tests);
		
		entityManager.persist(test);
		entityManager.persist(product);

		entityManager.getTransaction().commit();
		entityManager.close();
		sessionFactory.close();
	}
}
