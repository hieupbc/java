package com.qlbckh.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NhaKhoaHoc database table.
 * 
 */
@Entity
@NamedQuery(name="NhaKhoaHoc.findAll", query="SELECT n FROM NhaKhoaHoc n")
public class NhaKhoaHoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int maNhaKhoaHoc;

	@Temporal(TemporalType.DATE)
	private Date ngaySinh;

	private String ten;

	//bi-directional many-to-one association to Baocao_Nguoithuchien
	@OneToMany(mappedBy="nhaKhoaHoc")
	private List<Baocao_Nguoithuchien> baocaoNguoithuchiens;

	//bi-directional many-to-one association to ChucDanh
	@ManyToOne
	@JoinColumn(name="ChucDanh")
	private ChucDanh chucDanhBean;

	//bi-directional many-to-one association to CoQuan
	@ManyToOne
	@JoinColumn(name="CoQuan")
	private CoQuan coQuanBean;

	public NhaKhoaHoc() {
	}

	public int getMaNhaKhoaHoc() {
		return this.maNhaKhoaHoc;
	}

	public void setMaNhaKhoaHoc(int maNhaKhoaHoc) {
		this.maNhaKhoaHoc = maNhaKhoaHoc;
	}

	public Date getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<Baocao_Nguoithuchien> getBaocaoNguoithuchiens() {
		return this.baocaoNguoithuchiens;
	}

	public void setBaocaoNguoithuchiens(List<Baocao_Nguoithuchien> baocaoNguoithuchiens) {
		this.baocaoNguoithuchiens = baocaoNguoithuchiens;
	}

	public Baocao_Nguoithuchien addBaocaoNguoithuchien(Baocao_Nguoithuchien baocaoNguoithuchien) {
		getBaocaoNguoithuchiens().add(baocaoNguoithuchien);
		baocaoNguoithuchien.setNhaKhoaHoc(this);

		return baocaoNguoithuchien;
	}

	public Baocao_Nguoithuchien removeBaocaoNguoithuchien(Baocao_Nguoithuchien baocaoNguoithuchien) {
		getBaocaoNguoithuchiens().remove(baocaoNguoithuchien);
		baocaoNguoithuchien.setNhaKhoaHoc(null);

		return baocaoNguoithuchien;
	}

	public ChucDanh getChucDanhBean() {
		return this.chucDanhBean;
	}

	public void setChucDanhBean(ChucDanh chucDanhBean) {
		this.chucDanhBean = chucDanhBean;
	}

	public CoQuan getCoQuanBean() {
		return this.coQuanBean;
	}

	public void setCoQuanBean(CoQuan coQuanBean) {
		this.coQuanBean = coQuanBean;
	}

}