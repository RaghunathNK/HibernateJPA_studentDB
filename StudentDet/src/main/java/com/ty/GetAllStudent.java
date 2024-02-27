package com.ty;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Student s where s.phno=?1");
		query.setParameter(1, 76327728l);
		List<Student> students=query.getResultList();
		
		for(Student student:students)
		{
			System.out.println("student id :"+student.getId());
			System.out.println("student name :"+student.getName());
			System.out.println("student age :"+student.getAge());
			System.out.println("student gender :"+student.getGender());
			System.out.println("student phno :"+student.getPhno());
			System.out.println("student marks :"+student.getMarks());
			System.out.println("student cource :"+student.getCource());
			
			System.out.println("----------------------------------------");
		}	
		
	}
}
