package GoodsDataBase.HibernateDB;

import entity.Laptop;
import entity.PC;
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
		Unit printer = new Printer("HP", "hp444", "printer", "c332", "color", "laser", 200);
		Unit pc = new PC("Apple", "cf345g", "pc", "c333", 10, 16, 250, 10, 700);
		Unit laptop = new Laptop("Apple", "cf345g", "laptop", "c334", 10, 16, 250, 1000, 15);
		
		Set<Unit> tests = new HashSet<>();
		tests.add(test);
		tests.add(printer);
		tests.add(pc);
		tests.add(laptop);
		product.setTests(tests);
		
		entityManager.persist(test);
		entityManager.persist(printer);
		entityManager.persist(pc);
		entityManager.persist(product);
		entityManager.persist(laptop);

		entityManager.getTransaction().commit();
		entityManager.close();
		sessionFactory.close();
	}
}
