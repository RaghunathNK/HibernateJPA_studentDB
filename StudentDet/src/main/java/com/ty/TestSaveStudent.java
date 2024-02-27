package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("dboss");
		student.setAge(22);
		student.setGender("male");
		student.setPhno(76327728l);
		student.setMarks(90);
		student.setCource("biology");
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
