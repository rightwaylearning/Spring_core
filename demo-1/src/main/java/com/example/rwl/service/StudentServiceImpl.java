package com.example.rwl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rwl.dao.IStudentDao;
import com.example.rwl.model.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	IStudentDao  iStudentDao;

	@Override
	public List<Student> getList() {
		return  iStudentDao.getList();
	}

}
