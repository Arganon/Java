package Many_to_many.MyTable06;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
		
		Room room1 = new Room();
		room1.setRoomNo("111");
		
		Room room2 = new Room();
		room2.setRoomNo("222");
		
		entityManager.persist(room1);
		entityManager.persist(room2);
		
		User user1 = new User();
		user1.setName("Ivan");
		user1.setSurname("Bednyj");
		user1.setRoom(room1);
		
		User user2 = new User();
		user2.setName("Andrey");
		user2.setSurname("Dreva");
		user2.setRoom(room2);
		
		entityManager.persist(user1);
		entityManager.persist(user2);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		sessionFactory.close();
	}
}
