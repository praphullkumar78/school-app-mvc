package com.ty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public Student updateStudent(Student student) {
		Student student2 = studentDao.getStudentById(student.getId());
		if (student2 != null) {
			return studentDao.updateStudent(student);
		} else {
			return null;
		}
	}

	public String deleteStudentBtId(int id) {
		if (studentDao.deleteStudentById(id)) {
			return "SUCCESSFULLY DELETED";
		} else {
			return "No Data with ID " + id + " to Delete";
		}
	}

	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

}
