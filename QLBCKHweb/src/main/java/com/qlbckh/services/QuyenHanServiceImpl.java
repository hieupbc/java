package com.qlbckh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlbckh.entities.QuyenHan;
import com.qlbckh.repositories.QuyenHanRepository;

@Service
public class QuyenHanServiceImpl implements QuyenHanService {

	@Autowired
	private QuyenHanRepository quyenHanRepository;

	@Override
	public List<QuyenHan> getAll() {
		List<QuyenHan> list = new ArrayList<>();
		Iterable<QuyenHan> findAll = quyenHanRepository.findAll();
		for (QuyenHan quyenHan : findAll) {
			list.add(quyenHan);
		}
		return list;
	}

}
