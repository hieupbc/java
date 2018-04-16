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
 * The persistent class for the QuyenHan database table.
 *
 */
@Entity
@NamedQuery(name = "QuyenHan.findAll", query = "SELECT q FROM QuyenHan q")
public class QuyenHan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDQuyenHan;

	private String tenQuyenHan;

	// bi-directional many-to-one association to NguoiSuDung
	@OneToMany(mappedBy = "quyenHanBean")
	private List<NguoiSuDung> nguoiSuDungs;

	public QuyenHan() {
	}

	public int getIDQuyenHan() {
		return this.IDQuyenHan;
	}

	public void setIDQuyenHan(int IDQuyenHan) {
		this.IDQuyenHan = IDQuyenHan;
	}

	public String getTenQuyenHan() {
		return this.tenQuyenHan;
	}

	public void setTenQuyenHan(String tenQuyenHan) {
		this.tenQuyenHan = tenQuyenHan;
	}

	public List<NguoiSuDung> getNguoiSuDungs() {
		return this.nguoiSuDungs;
	}

	public void setNguoiSuDungs(List<NguoiSuDung> nguoiSuDungs) {
		this.nguoiSuDungs = nguoiSuDungs;
	}

	public NguoiSuDung addNguoiSuDung(NguoiSuDung nguoiSuDung) {
		getNguoiSuDungs().add(nguoiSuDung);
		nguoiSuDung.setQuyenHanBean(this);

		return nguoiSuDung;
	}

	public NguoiSuDung removeNguoiSuDung(NguoiSuDung nguoiSuDung) {
		getNguoiSuDungs().remove(nguoiSuDung);
		nguoiSuDung.setQuyenHanBean(null);

		return nguoiSuDung;
	}

}