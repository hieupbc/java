package com.qlsv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlsv.entities.Clazz;
import com.qlsv.repository.ClazzRepository;

@Service
public class ClazzServiceImpl implements ClazzService {

	@Autowired
	private ClazzRepository clazzRepository;

	@Override
	public List<Clazz> getAllClazz() {
		List<Clazz> clazzs = new ArrayList<>();
		clazzRepository.findAll().iterator().forEachRemaining(clazz -> clazzs.add(clazz));
		return clazzs;
	}

	@Override
	public Clazz getClazzById(int id) {
		Clazz clazz = clazzRepository.findById(id).get();
		return clazz;
	}

}
