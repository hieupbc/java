package com.qlbckh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qlbckh.dto.NguoiSuDungDTO;
import com.qlbckh.entities.NguoiSuDung;
import com.qlbckh.entities.QuyenHan;
import com.qlbckh.repositories.NguoiSuDungRepository;

@Service
public class NguoiSuDungServiceImpl implements NguoiSuDungService {

	@Autowired
	NguoiSuDungRepository nguoiSuDungRepository;

	@Override
	public NguoiSuDungDTO convertToDTO(NguoiSuDung nguoiSuDung) {
		NguoiSuDungDTO nguoiSuDungDTO = new NguoiSuDungDTO(nguoiSuDung.getUserID(), nguoiSuDung.getPassword(),
				nguoiSuDung.getQuyenHanBean().getTenQuyenHan());
		return nguoiSuDungDTO;
	}

	@Transactional
	@Override
	public List<NguoiSuDungDTO> getAllDTO() {
		List<NguoiSuDungDTO> nguoiSuDungs = new ArrayList<NguoiSuDungDTO>();
		Iterable<NguoiSuDung> findAll = nguoiSuDungRepository.findAll();
		for (NguoiSuDung nguoiSuDung : findAll) {
			nguoiSuDungs.add(convertToDTO(nguoiSuDung));
		}
		return nguoiSuDungs;
	}

	@Override
	@Transactional
	public boolean checkLogin(String username, String password) {
		if (nguoiSuDungRepository.findById(username).isPresent()) {
			NguoiSuDung nguoiSuDung = nguoiSuDungRepository.findById(username).get();
			return (nguoiSuDung != null && nguoiSuDung.getPassword().equals(password));
		}
		return false;
	}

	@Override
	@Transactional
	public NguoiSuDungDTO getNguoiSudungDTO(String username) {
		// TODO Auto-generated method stub
		if (nguoiSuDungRepository.findById(username).isPresent()) {
			NguoiSuDung nguoiSuDung = nguoiSuDungRepository.findById(username).get();
			return convertToDTO(nguoiSuDung);
		}
		return null;

	}

	@Override
	@Transactional
	public NguoiSuDung convertFromDTO(NguoiSuDungDTO nguoiSuDungDTO) {
		NguoiSuDung nguoiSuDung = new NguoiSuDung(nguoiSuDungDTO.getUserID(), nguoiSuDungDTO.getPassword());
		QuyenHan quyenHan = new QuyenHan();
		quyenHan.setTenQuyenHan(nguoiSuDungDTO.getQuyenHan());
		quyenHan.setIDQuyenHan((quyenHan.getTenQuyenHan().equals("admin") ? 1 : 2));
		nguoiSuDung.setQuyenHanBean(quyenHan);
		return nguoiSuDung;
	}

	@Override
	@Transactional
	public void updateUserInfo(NguoiSuDung nguoiSuDung) {
		nguoiSuDungRepository.save(nguoiSuDung);
	}
}
