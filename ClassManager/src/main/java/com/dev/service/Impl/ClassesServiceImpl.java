package com.dev.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.domain.Classes;
import com.dev.mapper.ClassesMapper;
import com.dev.service.ClassesService;

@Service
public class ClassesServiceImpl implements ClassesService {
	
	private ClassesMapper classesMapper;
	
	public ClassesServiceImpl(ClassesMapper classesMapper) {
		this.classesMapper = classesMapper;
	}
	
	@Override
	public List<Classes> selectAllClasses(long no) {
		List<Classes> classes = classesMapper.selectAllClasses(no);
		return classes;
	}
	
	@Override
	public void insertClass(Classes classes) {
		classesMapper.insertClass(classes);
	}
	
	@Override
	public Classes selectSubjectInfo(long table_no, String subject) {
		Classes classes = classesMapper.selectSubjectInfo(table_no, subject);
		return classes;
	}
}
