package com.qlbckh.services;

import java.util.List;

import com.qlbckh.dto.BaocaoDTO;
import com.qlbckh.entities.BaoCao;

public interface BaoCaoService {

	BaoCao convertFromDTO(BaocaoDTO baocaoDTO);

	BaocaoDTO convertToDTO(BaoCao baoCao);

	List<BaocaoDTO> getAllBaoCao();

	BaocaoDTO timBaoCaoTheoID(int id);

}
