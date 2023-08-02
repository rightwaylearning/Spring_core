package com.example.rwl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rwl.model.Student;

@Repository
public class StudentDaoImpl  implements IStudentDao{

	@Override
	public List<Student> getList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("A", 123));
		list.add(new Student("B", 223));
		return list;
	}

}
