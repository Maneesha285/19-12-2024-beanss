//package jpaentity;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.Query;
//
//import java.util.List;
//
//public class Service {
//
//
//
//
//        public List<EmployeeEntity> getEmployeesData() {
//
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//            entityManager.getTransaction().begin();
//            Query query = entityManager.createQuery("select p from EmployeeEntity p");
//            List<EmployeeEntity> resultList = query.getResultList();
//
//            entityManager.getTransaction().commit();
//
//            return resultList;
//        }
//   //     public List<ProjectEntity> getProjectDataAndEmp() {
////
////          //  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
////            EntityManager entityManager = entityManagerFactory.createEntityManager();
////
////            entityManager.getTransaction().begin();
////
////            Query query = entityManager.createQuery("select p from ProjectEntity p  join fetch p.employeeEntities ");
////
////            List<ProjectEntity> resultList = query.getResultList();
////
////            entityManager.getTransaction().commit();
//
////            for (ProjectEntity p:resultList){
////                System.out.println(p.getStartdate());
////                System.out.println(p.getEnddate());
////            }
//
//         //   return resultList;
//        }
//
//        public List<ProjectEntity> selfJoinOnEmp() {
//
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//            entityManager.getTransaction().begin();
//
//            Query query = entityManager.createQuery("SELECT e.name,m FROM EmployeeEntity e,EmployeeEntity m where e.managerid=m.empid");
//            List<ProjectEntity> resultList = query.getResultList();
//
//            entityManager.getTransaction().commit();
//
//            for (ProjectEntity p:resultList){
//                System.out.println(p.getStartdate());
//                // System.out.println(p.getEmployeeEntityList());
//            }
//
//            return resultList;
//        }
//
//     //   public void insertEmployeesData() {
//
//     //       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
//    //        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//      /      entityManager.getTransaction().begin();
//
////        EmployeeEntity entity=new EmployeeEntity();
////        entity.setName("Mani");
////        entity.setDept("IT");
//
//            EmployeeEntity entity1=new EmployeeEntity();
//            entity1.getName();
//            entity1.setName("Maneesha");
//            entity1.setDept("IT");
//
//            // entityManager.persist(entity);
//            entityManager.persist(entity1);
//            entityManager.getTransaction().commit();
//        }
//
//
//        /////// salary > 20k /////////
//
////
////    public List<EmployeeEntity> getEmployeesWithSalaryAboveThreshold(double salaryThreshold) {
////        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
////        EntityManager entityManager = entityManagerFactory.createEntityManager();
////
////        entityManager.getTransaction().begin();
////
////        // Use a named parameter in the query
////        Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e WHERE e.salary > :salary");
////        query.setParameter("salary", salaryThreshold);
////
////        List<EmployeeEntity> resultList = query.getResultList();
////
////        entityManager.getTransaction().commit();
////
////
////        return resultList;
////    }
//
//    }
//
