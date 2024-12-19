package jpaonetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OneToOneTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em= entityManagerFactory.createEntityManager();
      em.getTransaction().begin();

        PersonEntity1 person = new PersonEntity1();
        person.setName("Maneesha");
       // person.setAddressenity();
        em.persist(person);

         //Create an address
        AddressEntity1 address = new AddressEntity1();
        address.setPersonEntity1(person);
        address.setCity("Hyderabad");
        em.persist(address);
        person.setAddressenity(address);

        em.getTransaction().commit();

        PersonEntity1 retrivedperson=em.find(PersonEntity1.class,person.getPid());
        System.out.println(retrivedperson.getName());
        System.out.println(retrivedperson.getAddressenity().getCity());

        em.close();
        entityManagerFactory.close();
    }
}
