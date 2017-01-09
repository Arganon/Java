package GoodsDataBase.HibernateDB;

import entity.Printer;
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
		Unit test = new Test("samsung", "y555x", "Test", "Test");
		Unit printer = new Printer("HP", "hp444", "printer", "color", "c123", "laser", 200);
		
		
		Set<Unit> tests = new HashSet<>();
		tests.add(test);
		tests.add(printer);
		product.setTests(tests);
		
		entityManager.persist(test);
		entityManager.persist(printer);
		entityManager.persist(product);

		entityManager.getTransaction().commit();
		entityManager.close();
		sessionFactory.close();
	}
}
