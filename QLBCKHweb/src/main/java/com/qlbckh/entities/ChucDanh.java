package com.qlbckh.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ChucDanh database table.
 * 
 */
@Entity
@NamedQuery(name="ChucDanh.findAll", query="SELECT c FROM ChucDanh c")
public class ChucDanh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int maChucDanh;

	private String tenChucDanh;

	//bi-directional many-to-one association to NhaKhoaHoc
	@OneToMany(mappedBy="chucDanhBean")
	private List<NhaKhoaHoc> nhaKhoaHocs;

	public ChucDanh() {
	}

	public int getMaChucDanh() {
		return this.maChucDanh;
	}

	public void setMaChucDanh(int maChucDanh) {
		this.maChucDanh = maChucDanh;
	}

	public String getTenChucDanh() {
		return this.tenChucDanh;
	}

	public void setTenChucDanh(String tenChucDanh) {
		this.tenChucDanh = tenChucDanh;
	}

	public List<NhaKhoaHoc> getNhaKhoaHocs() {
		return this.nhaKhoaHocs;
	}

	public void setNhaKhoaHocs(List<NhaKhoaHoc> nhaKhoaHocs) {
		this.nhaKhoaHocs = nhaKhoaHocs;
	}

	public NhaKhoaHoc addNhaKhoaHoc(NhaKhoaHoc nhaKhoaHoc) {
		getNhaKhoaHocs().add(nhaKhoaHoc);
		nhaKhoaHoc.setChucDanhBean(this);

		return nhaKhoaHoc;
	}

	public NhaKhoaHoc removeNhaKhoaHoc(NhaKhoaHoc nhaKhoaHoc) {
		getNhaKhoaHocs().remove(nhaKhoaHoc);
		nhaKhoaHoc.setChucDanhBean(null);

		return nhaKhoaHoc;
	}

}