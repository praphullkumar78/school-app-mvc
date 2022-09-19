package com.ty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dto.Student;
import com.ty.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/register")
	public ModelAndView registerStudent() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.jsp");
		modelAndView.addObject(new Student());
		return modelAndView;
	}

	@RequestMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		List<Student> list = studentService.getAllStudent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view.jsp");
		modelAndView.addObject("students", list);
		return modelAndView;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteStudent(int id) {
		studentService.deleteStudentBtId(id);
		List<Student> list = studentService.getAllStudent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view.jsp");
		modelAndView.addObject("students", list);
		return modelAndView;
	}

	@RequestMapping("/edit")
	public ModelAndView editStudent(int id) {
		Student student = studentService.getStudentById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		modelAndView.setViewName("edit.jsp");
		return modelAndView;
	}

	@RequestMapping("/update")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		studentService.updateStudent(student);
		List<Student> list = studentService.getAllStudent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view.jsp");
		modelAndView.addObject("students", list);
		return modelAndView;
	}
}
