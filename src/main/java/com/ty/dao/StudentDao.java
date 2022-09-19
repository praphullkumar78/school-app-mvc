package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ty.dto.Student;

@Repository
public class StudentDao {
	@Autowired
	EntityManager entityManager;

	public Student saveStudent(Student student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return student;

	}

	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}

	public Student updateStudent(Student student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}

	public boolean deleteStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public List<Student> getAllStudent() {
		String jpql = "SELECT s FROM Student s";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
