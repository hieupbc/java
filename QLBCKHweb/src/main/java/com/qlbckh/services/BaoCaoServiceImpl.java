package com.qlbckh.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlbckh.dto.BaocaoDTO;
import com.qlbckh.entities.BaoCao;
import com.qlbckh.repositories.BaoCaoRepository;

@Service
public class BaoCaoServiceImpl implements BaoCaoService {

	@Autowired
	private BaoCaoRepository baoCaoRepository;

	@Override
	public BaoCao convertFromDTO(BaocaoDTO baocaoDTO) {
		BaoCao baoCao = new BaoCao();
		baoCao.setIDBaoCao(baocaoDTO.getBaoCaoID());
		baoCao.setTenBaoCao(baocaoDTO.getTenBaoCao());
		baoCao.setNgayHoanThanh(new Date(baocaoDTO.getNgayHoanThanh()));
		baoCao.setDuongDan(baocaoDTO.getDuongDan());

		return baoCao;
	}

	@Override
	public BaocaoDTO convertToDTO(BaoCao baoCao) {
		BaocaoDTO baocaoDTO = new BaocaoDTO(baoCao.getIDBaoCao(), baoCao.getTenBaoCao(),
				baoCao.getTheLoaiBaoCao().getTenLoaiBaoCao(), baoCao.getDuongDan(),
				baoCao.getNgayHoanThanh().toString(), baoCao.getLinhVuc().getTenLinhVuc());
		return baocaoDTO;
	}

	@Override
	public List<BaocaoDTO> getAllBaoCao() {
		List<BaocaoDTO> baocaoDTOs = new ArrayList<>();
		Iterable<BaoCao> findAll = baoCaoRepository.findAll();
		for (BaoCao baoCao : findAll) {
			baocaoDTOs.add(convertToDTO(baoCao));
		}
		return baocaoDTOs;
	}

	@Override
	public BaocaoDTO timBaoCaoTheoID(int id) {
		if (baoCaoRepository.findById(id).isPresent()) {
			return convertToDTO(baoCaoRepository.findById(id).get());
		}
		return null;
	}

}
