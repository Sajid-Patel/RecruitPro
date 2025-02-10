package com.campus_recruitment.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.campus_recruitment.entities.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int createStudent(Student student) {
		try {
			Session session = sessionFactory.openSession();

			Student std = session.get(Student.class, student.getId());

			if (std == null) {
				session.save(student);
				session.beginTransaction().commit();
				return 1;
			} else {

				return 2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 3;
		}
	}

	public int createMultipleStudent(List<Student> liststudent) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transction = session.beginTransaction();

			if (liststudent != null && !liststudent.isEmpty()) {
				// Loop through the list and save each student
				for (Student student : liststudent) {
					session.save(student);
				}
				transction.commit();
				return 1; // Success
			} else {

				return 2; // No Student to Save
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 3; // Error Occurred
		}
	}

	public List<Student> fetchAllStudents() {
		Session session = null;

		try {

			session = sessionFactory.openSession();
			String hql = "FROM Students"; // HQL to fetch all Students
			Query<Student> query = session.createQuery(hql, Student.class);
			return query.getResultList(); // Retrive the list of Students

		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList(); // Return empty list in case of Errors

		} finally {
			if (session != null && session.isOpen()) {
				session.close(); // Close session to release resources
			}
		}
	}

	public int deleteStudent(Long id) {
		try {
			Session session = sessionFactory.openSession();

			Student std = session.get(Student.class, id);

			if (std != null) {
				session.delete(std);
				session.beginTransaction().commit();
				return 1;
			} else {

				return 2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 3;
		}
	}

}
