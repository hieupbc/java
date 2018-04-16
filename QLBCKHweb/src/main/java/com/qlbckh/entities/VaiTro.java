package com.qlbckh.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the VaiTro database table.
 * 
 */
@Entity
@NamedQuery(name="VaiTro.findAll", query="SELECT v FROM VaiTro v")
public class VaiTro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ma;

	private String ten;

	//bi-directional many-to-one association to Baocao_Nguoithuchien
	@OneToMany(mappedBy="vaiTroBean")
	private List<Baocao_Nguoithuchien> baocaoNguoithuchiens;

	public VaiTro() {
	}

	public int getMa() {
		return this.ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
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
		baocaoNguoithuchien.setVaiTroBean(this);

		return baocaoNguoithuchien;
	}

	public Baocao_Nguoithuchien removeBaocaoNguoithuchien(Baocao_Nguoithuchien baocaoNguoithuchien) {
		getBaocaoNguoithuchiens().remove(baocaoNguoithuchien);
		baocaoNguoithuchien.setVaiTroBean(null);

		return baocaoNguoithuchien;
	}

}