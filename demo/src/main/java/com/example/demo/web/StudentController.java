package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String showStudents(Model model) {
		System.out.println("students");
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("Eero", "Esimerkki"));
		student.add(new Student("Milla", "Malli"));
		student.add(new Student("Anna", "Ahkera"));
		
		model.addAttribute("students", student);
		return "studentList";
	}

}
