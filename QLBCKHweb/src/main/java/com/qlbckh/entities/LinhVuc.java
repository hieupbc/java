package com.qlbckh.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the LinhVuc database table.
 *
 */
@Entity
@NamedQuery(name = "LinhVuc.findAll", query = "SELECT l FROM LinhVuc l")
public class LinhVuc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLinhVuc;

	private String tenLinhVuc;

	@OneToMany(mappedBy = "LinhVuc")
	private List<BaoCao> baoCaos;

	public List<BaoCao> getBaoCaos() {
		return baoCaos;
	}

	public void setBaoCaos(List<BaoCao> baoCaos) {
		this.baoCaos = baoCaos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public LinhVuc() {
	}

	public int getIdLinhVuc() {
		return this.idLinhVuc;
	}

	public void setIdLinhVuc(int idLinhVuc) {
		this.idLinhVuc = idLinhVuc;
	}

	public String getTenLinhVuc() {
		return this.tenLinhVuc;
	}

	public void setTenLinhVuc(String tenLinhVuc) {
		this.tenLinhVuc = tenLinhVuc;
	}

}