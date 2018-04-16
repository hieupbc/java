package com.qlbckh.services;

import java.util.List;

import com.qlbckh.dto.NguoiSuDungDTO;
import com.qlbckh.entities.NguoiSuDung;

public interface NguoiSuDungService {

	NguoiSuDungDTO convertToDTO(NguoiSuDung nguoiSuDung);

	List<NguoiSuDungDTO> getAllDTO();

	boolean checkLogin(String username, String password);

	NguoiSuDungDTO getNguoiSudungDTO(String username);

	NguoiSuDung convertFromDTO(NguoiSuDungDTO nguoiSuDungDTO);

	void updateUserInfo(NguoiSuDung nguoiSuDung);

}
