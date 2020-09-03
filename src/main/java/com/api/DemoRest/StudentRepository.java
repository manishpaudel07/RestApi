package com.api.DemoRest;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	List<Students> studentsList;
	public StudentRepository()
	{
		
		studentsList=new ArrayList<>();
		Students students=new  Students();
		
		System.out.println("students");
	
		students.setName("anish");
		students.setPhoneNumber("214989224");
		students.setStudentId(1);
		
		
		Students students2= new Students();
		students2.setName("suvam");
		students2.setPhoneNumber("23143113");
		students2.setStudentId(2);
	
		studentsList.add(students);
		studentsList.add(students2);
	}

	public List<Students> getStudents()
	{
		return studentsList;
	}
	
	public Students getOneStudent(int studentId)
	{
	
		
		for (Students std:studentsList)
		{
		if(std.getStudentId()==studentId)
		
			return std;
		
		}
		return new Students();
	}
	

	public void createStudent(Students students) {
		List<Students> list=new ArrayList<>();
		list.add(students);
		
	}

	public Students updateMessage(Students student)
	{
		
		if(student.getStudentId()<=0)
		{
			studentsList.add(student);
		}
		
		return student;
		
	}
	
}
