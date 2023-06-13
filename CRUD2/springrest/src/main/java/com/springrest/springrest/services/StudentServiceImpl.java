package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;


@Service 
public class StudentServiceImpl implements StudentService {
  
	 @Autowired
	 private StudentDao studentDao;
	//List<Student> list;
	
	public StudentServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Student(1, "shivam", "Coder", "pune"));
//		list.add(new Student(2, "parth", "tester", "mumbai"));
	}
	
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll(); 
	}


	@Override
	public Student getStudent(long studentId) {
		// TODO Auto-generated method stub
//		Student s=null;
//		for(Student student:list)
//		{
//			if(student.getId()==studentId)
//			{
//				s=student;
//				break;
//			}
//		}
		return studentDao.getOne(studentId);
	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		//list.add(student);
		return studentDao.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			if(e.getId()== student.getId())
//			{
//				e.setCity(student.getCity());
//				e.setDescription(student.getDescription());
//				e.setName(student.getName());
//				e.setId(student.getId());
//			}
//		});
		    studentDao.save(student);
		return student;
	}


	@Override
	public void deleteStudent(long parseLong) {
		// TODO Auto-generated method stub
		
		//list=this.list.stream().filter(e -> e.getId()!= parseLong).collect(Collectors.toList()); 
		
		@SuppressWarnings("deprecation")
		Student entity = studentDao.getOne(parseLong);
			studentDao.delete(entity);
	}

}
