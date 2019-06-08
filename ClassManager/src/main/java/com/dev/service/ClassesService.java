package com.dev.service;

import java.util.List;

import com.dev.domain.Classes;

public interface ClassesService {
	public List<Classes> selectAllClasses(long no);
	public void insertClass(Classes classes);
	public void updateClass(Classes newClass);
	public void deleteClass(long tno);
	public Classes selectSubjectInfo(long table_no, String subject);
}
