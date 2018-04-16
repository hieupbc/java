package com.qlbckh.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: BaoCao
 *
 */
@Entity
@NamedQuery(name = "BaoCao.findAll", query = "SELECT c FROM BaoCao c")
public class BaoCao implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDBaoCao;
	private String TenBaoCao;
	@ManyToOne
	@JoinColumn(name = "TheLoaiBaoCao")
	private TheLoaiBaoCao TheLoaiBaoCao;
	private String DuongDan;
	private Date NgayHoanThanh;
	@ManyToOne
	@JoinColumn(name = "LinhVuc")
	private LinhVuc LinhVuc;
	private static final long serialVersionUID = 1L;

	public BaoCao() {
		super();
	}

	public int getIDBaoCao() {
		return this.IDBaoCao;
	}

	public void setIDBaoCao(int IDBaoCao) {
		this.IDBaoCao = IDBaoCao;
	}

	public String getTenBaoCao() {
		return this.TenBaoCao;
	}

	public void setTenBaoCao(String TenBaoCao) {
		this.TenBaoCao = TenBaoCao;
	}

	public TheLoaiBaoCao getTheLoaiBaoCao() {
		return this.TheLoaiBaoCao;
	}

	public void setTheLoaiBaoCao(TheLoaiBaoCao TheLoaiBaoCao) {
		this.TheLoaiBaoCao = TheLoaiBaoCao;
	}

	public String getDuongDan() {
		return this.DuongDan;
	}

	public void setDuongDan(String DuongDan) {
		this.DuongDan = DuongDan;
	}

	public Date getNgayHoanThanh() {
		return this.NgayHoanThanh;
	}

	public void setNgayHoanThanh(Date NgayHoanThanh) {
		this.NgayHoanThanh = NgayHoanThanh;
	}

	public LinhVuc getLinhVuc() {
		return this.LinhVuc;
	}

	public void setLinhVuc(LinhVuc LinhVuc) {
		this.LinhVuc = LinhVuc;
	}

}
