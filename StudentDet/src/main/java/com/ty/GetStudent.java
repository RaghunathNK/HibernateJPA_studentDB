package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudent {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();

	Student student=entityManager.find(Student.class,4);
	
	System.out.println("student id :"+student.getId());
	System.out.println("student name :"+student.getName());
	System.out.println("student age :"+student.getAge());
	System.out.println("student gender :"+student.getGender());
	System.out.println("student phno :"+student.getPhno());
	System.out.println("student marks :"+student.getMarks());
	System.out.println("student cource :"+student.getCource());
	
	
}
}
