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
 * The persistent class for the TheLoaiBaoCao database table.
 *
 */
@Entity
@NamedQuery(name = "TheLoaiBaoCao.findAll", query = "SELECT t FROM TheLoaiBaoCao t")
public class TheLoaiBaoCao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDLoaiBaoCao;

	private String tenLoaiBaoCao;

	@OneToMany(mappedBy = "TheLoaiBaoCao")
	private List<BaoCao> baoCaos;

	public TheLoaiBaoCao() {
	}

	public int getIDLoaiBaoCao() {
		return this.IDLoaiBaoCao;
	}

	public void setIDLoaiBaoCao(int IDLoaiBaoCao) {
		this.IDLoaiBaoCao = IDLoaiBaoCao;
	}

	public String getTenLoaiBaoCao() {
		return this.tenLoaiBaoCao;
	}

	public void setTenLoaiBaoCao(String tenLoaiBaoCao) {
		this.tenLoaiBaoCao = tenLoaiBaoCao;
	}

	public List<BaoCao> getBaoCaos() {
		return baoCaos;
	}

	public void setBaoCaos(List<BaoCao> baoCaos) {
		this.baoCaos = baoCaos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}