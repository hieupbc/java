package com.qlbckh.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CoQuan database table.
 * 
 */
@Entity
@NamedQuery(name="CoQuan.findAll", query="SELECT c FROM CoQuan c")
public class CoQuan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int maCoQuan;

	private String tenCoQuan;

	//bi-directional many-to-one association to NhaKhoaHoc
	@OneToMany(mappedBy="coQuanBean")
	private List<NhaKhoaHoc> nhaKhoaHocs;

	public CoQuan() {
	}

	public int getMaCoQuan() {
		return this.maCoQuan;
	}

	public void setMaCoQuan(int maCoQuan) {
		this.maCoQuan = maCoQuan;
	}

	public String getTenCoQuan() {
		return this.tenCoQuan;
	}

	public void setTenCoQuan(String tenCoQuan) {
		this.tenCoQuan = tenCoQuan;
	}

	public List<NhaKhoaHoc> getNhaKhoaHocs() {
		return this.nhaKhoaHocs;
	}

	public void setNhaKhoaHocs(List<NhaKhoaHoc> nhaKhoaHocs) {
		this.nhaKhoaHocs = nhaKhoaHocs;
	}

	public NhaKhoaHoc addNhaKhoaHoc(NhaKhoaHoc nhaKhoaHoc) {
		getNhaKhoaHocs().add(nhaKhoaHoc);
		nhaKhoaHoc.setCoQuanBean(this);

		return nhaKhoaHoc;
	}

	public NhaKhoaHoc removeNhaKhoaHoc(NhaKhoaHoc nhaKhoaHoc) {
		getNhaKhoaHocs().remove(nhaKhoaHoc);
		nhaKhoaHoc.setCoQuanBean(null);

		return nhaKhoaHoc;
	}

}