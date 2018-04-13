package com.qlsv.service;

import java.util.List;

import com.qlsv.entities.Clazz;

public interface ClazzService {

	List<Clazz> getAllClazz();

	Clazz getClazzById(int id);

}
